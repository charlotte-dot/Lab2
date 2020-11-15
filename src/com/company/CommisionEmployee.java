package com.company;

public class CommisionEmployee extends Employee {
    private double grossSales;
    private double commisionRate;

    public CommisionEmployee(String firstName, String lastName, double grossSales, double commisionRate) {
        super(firstName, lastName);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    @Override
    public double earnings() {
        return getGrossSales()*getCommisionRate();
    }
}

