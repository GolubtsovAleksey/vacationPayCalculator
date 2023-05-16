package com.web.vacationPayCalculator.service.impl;

import com.web.vacationPayCalculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public double vacationPayCalculate(int averageSalary, int vacationDays) {
        return averageSalary / 29.3 * vacationDays;              // 29,3 (среднее число дней в месяце)

    }

}
