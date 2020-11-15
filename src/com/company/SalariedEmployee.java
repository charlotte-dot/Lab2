package com.company;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        if(weeklySalary<0.0){
            throw new IllegalArgumentException("weekly salary must be greater 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary<0.0){
            throw new IllegalArgumentException("weekly salary can't be less than 0");
        }
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
}
