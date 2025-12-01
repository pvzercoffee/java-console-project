package com.pvzer;

public class FullTimeEmployee extends Employee implements Bonus{

    private double baseSalary;


    public FullTimeEmployee(String id,String name,String department,double baseSalary)
    {
        super(id,name,department);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+calculateBonus();
    }



    @Override
    public double calculateBonus() {
        return baseSalary*0.1;
    }


}
