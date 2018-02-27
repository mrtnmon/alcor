package alcor.controllers;

import alcor.calculator.AlcoholCalculator;
import alcor.model.AlcoholAmount;
import alcor.model.Beverage;
import alcor.model.UnitResponse;
import alcor.repository.BeverageRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Api(value = "Alcohol", description = "Operations about Alcoholcalculations")
public class SimpleRestController {


    @Autowired
    AlcoholCalculator alcoholCalculator;

    @Autowired
    BeverageRepository beverageRepository;

    private int times = 0;

    @RequestMapping(value = "/getunitsforbeverages",
            method = RequestMethod.POST,
            produces = "application/json"
    )
    public ResponseEntity<UnitResponse> getUnitsForBeverages(@RequestBody List<Beverage> beverageList){
        System.out.println("this is called: " + ++times);
        return new ResponseEntity<UnitResponse>(
                alcoholCalculator.getAlcoholAsNumberOfStandardBeers(alcoholCalculator.getAlcoholForBeverages(beverageList)),
                HttpStatus.OK);
    }


}


