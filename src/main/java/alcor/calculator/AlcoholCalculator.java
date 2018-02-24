package alcor.calculator;

import alcor.model.AlcoholAmount;
import alcor.model.Beverage;
import alcor.repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AlcoholCalculator {


    @Autowired
    private BeverageRepository beverageRepository;

    private Beverage standardPils;

    @PostConstruct
    private void setStandardPils(){
        standardPils = beverageRepository.findByName("standard_pils");

    }

    public AlcoholAmount getAlcoholMiligramsForOneBeverage(Beverage beverage){
        double grams = ((beverage.getAlcoholPercentage() / 100)  * beverage.getMililiter()) * 0.789;
        return new AlcoholAmount(grams);
    }

    public AlcoholAmount getAlcoholForBeverages(List<Beverage> beverageList){
        System.out.println("trying to automatic reloa   d");
        return getSingleAlcoholAmount(beverageList.stream()
                .map(b -> getAlcoholMiligramsForOneBeverage(b))
                .collect(Collectors.toList()));

    }

    public double getAlcoholAsNumberOfStandardBeers(AlcoholAmount alcohol){
        double gramsStandardbeer = getAlcoholMiligramsForOneBeverage(standardPils).getGrams();
        return alcohol.getGrams() / gramsStandardbeer;
    }

    private AlcoholAmount getSingleAlcoholAmount(List<AlcoholAmount> alcoholAmountList){
        double total = alcoholAmountList.stream().mapToDouble(AlcoholAmount::getGrams).sum();
        return new AlcoholAmount(total);
    }
}



