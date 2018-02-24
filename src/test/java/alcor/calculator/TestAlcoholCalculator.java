package alcor.calculator;

import alcor.model.AlcoholAmount;
import alcor.model.Beverage;
import org.hamcrest.number.IsCloseTo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;

//@SpringBootTest
//@RunWith(SpringRunner.class)
//@Ignore
public class TestAlcoholCalculator {

    @Autowired
    AlcoholCalculator alcoholCalculator;

//    @Test
//    public void getAlcoholMiligramsForOneStandardBeer(){
////        AlcoholAmount al
//        Beverage pintje = Beverage.builder().alcoholPercentage(5d).mililiter(250).build();
//        Beverage wijn = Beverage.builder().alcoholPercentage(12.5).mililiter(750).build();
//        Beverage shotWhiskey = Beverage.builder().alcoholPercentage(40d).mililiter(40).build();
//        Beverage duvel = Beverage.builder().alcoholPercentage(8.5).mililiter(330).build();
//
//        AlcoholAmount c = alcoholCalculator.getAlcoholMiligramsForOneBeverage(pintje);
//        AlcoholAmount c_1 = alcoholCalculator.getAlcoholMiligramsForOneBeverage(wijn);
//        AlcoholAmount c_2 = alcoholCalculator.getAlcoholMiligramsForOneBeverage(shotWhiskey);
//        AlcoholAmount c_3 = alcoholCalculator.getAlcoholMiligramsForOneBeverage(duvel);
//
//
//        assertThat(c.getGrams(), closeTo(10d, 1));
//        assertThat(c_1.getGrams(), equalTo(10));
//        assertThat(c_2.getGrams(), equalTo(10));
//        assertThat(c_3.getGrams(), equalTo(10));
//    }
//
//    @Test
//    public void getAlcoholAsNumberOfStandardBeersReturnsCorrectBeerForBottleWine(){
//        Beverage bottleOfWine = Beverage.builder().alcoholPercentage(12.5).mililiter(750).build();
//
//        double pintjes = alcoholCalculator.getAlcoholAsNumberOfStandardBeers(alcoholCalculator.getAlcoholMiligramsForOneBeverage(bottleOfWine));
//
//        assertThat(pintjes, closeTo(7.5d, 0.2d));
//    }
//
//
//    @Test
//    public void getAlcoholAsNumberOfStandardBeersReturnsCorrectBeerForDuvel(){
//        Beverage bottleOfWine = Beverage.builder().alcoholPercentage(8.5).mililiter(330).build();
//
//        double pintjes = alcoholCalculator.getAlcoholAsNumberOfStandardBeers(alcoholCalculator.getAlcoholMiligramsForOneBeverage(bottleOfWine));
//
//        assertThat(pintjes, closeTo(2.5d, 0.1));
//    }
//
//
//
//    @Test
//    public void getAlcoholAmountForListOfBeverages(){
//        Beverage pintje = Beverage.builder().alcoholPercentage(5d).mililiter(250).build();
////        Beverage wijn = Beverage.builder().alcoholPercentage(12.5).mililiter(750).build();
////        Beverage shotWhiskey = Beverage.builder().alcoholPercentage(40d).mililiter(40).build();
////        Beverage duvel = Beverage.builder().alcoholPercentage(8.5).mililiter(330).build();
//
////        List<Beverage> beverages = newArrayList(pintje, wijn, shotWhiskey, duvel);
//        List<Beverage> beverages = newArrayList(pintje, pintje);
//
//
//        AlcoholAmount ac = alcoholCalculator.getAlcoholForBeverages(beverages);
//
//        assertThat(ac.getGrams(), closeTo(20, 0.1));
//    }
}
