package com.web.vacationPayCalculator.controller;

import com.web.vacationPayCalculator.service.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    private static final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    @GetMapping
    public double calculatePay(@RequestParam("averageSalary") int averageSalary,
                               @RequestParam("vacationDays") int vacationDays) {
        logger.info("trying to get the averageSalary = {} and vacationDays = {} ", averageSalary, vacationDays);
        return calculatorService.vacationPayCalculate(averageSalary, vacationDays);
    }

}
