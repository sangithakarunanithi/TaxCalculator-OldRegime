package com.example.taxcalculator.controller;

import com.example.taxcalculator.entity.EmployeeTaxDetails;
import com.example.taxcalculator.repository.EmployeeTaxDetailsRepository;
import com.example.taxcalculator.service.TaxCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaxCalculatorController {

    @Autowired
    private TaxCalculatorService taxCalculatorService;

    @Autowired
    private EmployeeTaxDetailsRepository repository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("taxDetails", new EmployeeTaxDetails());
        return "tax-form";
    }

    @PostMapping("/calculateTax")
    public String calculateTax(@ModelAttribute EmployeeTaxDetails taxDetails, Model model) {
        double finalTax = taxCalculatorService.calculateTax(taxDetails);
        repository.save(taxDetails);
        model.addAttribute("finalTax", finalTax);
        return "tax-result";
    }
}

