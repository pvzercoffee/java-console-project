package com.pvzer;

public class PartTimeEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String id,String name,String department,double hourlyRate, int hoursWorked)
    {
        super(id,name,department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
}
