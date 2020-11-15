package com.company;

public class BaseEmployee extends CommisionEmployee{
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, grossSales, commisionRate);
        if(baseSalary<0.0)
            throw new IllegalArgumentException("Base salart can't be lower 0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary()+super.earnings();
    }
}
