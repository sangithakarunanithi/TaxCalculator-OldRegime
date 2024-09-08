package com.example.taxcalculator.service;

import com.example.taxcalculator.entity.EmployeeTaxDetails;
import org.springframework.stereotype.Service;

@Service
public class TaxCalculatorService {

    public double calculateTax(EmployeeTaxDetails details) {
        double taxableIncome = details.getSalary() -
                details.getDeduction80C() -
                details.getDeduction80D() -
                details.getDeduction80E() -
                details.getNps() -
                details.getHouseLoan() -
                details.getDeduction80TTA() -
                details.getDeduction80G();

        return calculateTaxBasedOnIncome(taxableIncome);
    }

    private double calculateTaxBasedOnIncome(double taxableIncome) {
        // Implement old regime tax slabs here
        if (taxableIncome <= 250000) {
            return 0;
        } else if (taxableIncome <= 500000) {
            return (taxableIncome - 250000) * 0.05;
        } else if (taxableIncome <= 1000000) {
            return 12500 + (taxableIncome - 500000) * 0.2;
        } else {
            return 112500 + (taxableIncome - 1000000) * 0.3;
        }
    }
}
