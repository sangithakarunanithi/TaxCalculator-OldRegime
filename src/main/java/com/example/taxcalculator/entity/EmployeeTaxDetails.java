package com.example.taxcalculator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class EmployeeTaxDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double salary;
    private double deduction80C;
    private double deduction80D;
    private double deduction80E;
    private double nps;
    private double houseLoan;
    private double deduction80TTA;
    private double deduction80G;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDeduction80C() {
        return deduction80C;
    }

    public void setDeduction80C(double deduction80C) {
        this.deduction80C = deduction80C;
    }

    public double getDeduction80D() {
        return deduction80D;
    }

    public void setDeduction80D(double deduction80D) {
        this.deduction80D = deduction80D;
    }

    public double getDeduction80E() {
        return deduction80E;
    }

    public void setDeduction80E(double deduction80E) {
        this.deduction80E = deduction80E;
    }

    public double getNps() {
        return nps;
    }

    public void setNps(double nps) {
        this.nps = nps;
    }

    public double getHouseLoan() {
        return houseLoan;
    }

    public void setHouseLoan(double houseLoan) {
        this.houseLoan = houseLoan;
    }

    public double getDeduction80TTA() {
        return deduction80TTA;
    }

    public void setDeduction80TTA(double deduction80TTA) {
        this.deduction80TTA = deduction80TTA;
    }

    public double getDeduction80G() {
        return deduction80G;
    }

    public void setDeduction80G(double deduction80G) {
        this.deduction80G = deduction80G;
    }
}
