package alcor.calculator;

import alcor.model.AlcoholAmount;
import alcor.model.Beverage;

import alcor.model.UnitResponse;
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


    @Autowired
    private Beverage standardBeer;
//    private Beverage standardPils = new Beverage.BeverageBuilder().alcoholPercentage(5.0).mililiter(250).build();

//    @PostConstruct
//    private void setStandardPils(){
//        standardPils = beverageRepository.findByName("standard_pils");
//
//    }

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

    public UnitResponse getAlcoholAsNumberOfStandardBeers(AlcoholAmount alcohol){
        double gramsStandardbeer = getAlcoholMiligramsForOneBeverage(standardBeer).getGrams();
        return new UnitResponse(alcohol.getGrams() / gramsStandardbeer);
    }

    private AlcoholAmount getSingleAlcoholAmount(List<AlcoholAmount> alcoholAmountList){
        double total = alcoholAmountList.stream().mapToDouble(AlcoholAmount::getGrams).sum();
        return new AlcoholAmount(total);
    }
}



