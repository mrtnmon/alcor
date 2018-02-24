package alcor.controllers;

import alcor.calculator.AlcoholCalculator;
import alcor.model.AlcoholAmount;
import alcor.model.Beverage;
import alcor.repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleRestController {


    @Autowired
    AlcoholCalculator alcoholCalculator;

    @Autowired
    BeverageRepository beverageRepository;

//    @RequestMapping(value = "/getunitsforbeverages",
//            method = RequestMethod.POST,
//            produces = "application/json"
//    )
//    public ResponseEntity<String> getUnitsForBeverages(@RequestBody List<String> beverageList){
//
//        List<Beverage> beverages = beverageRepository.findByNameList(beverageList);
//        return new ResponseEntity<String>("Hello World ", HttpStatus.OK);
//    }

    @RequestMapping(value = "/getunitsforbeverages",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    public ResponseEntity<Double> getUnitsForBeverages(@RequestBody List<Beverage> beverageList){

        return new ResponseEntity<Double>(
                alcoholCalculator.getAlcoholAsNumberOfStandardBeers(alcoholCalculator.getAlcoholForBeverages(beverageList)),
                HttpStatus.OK);
    }
}


