package com.pvzer;

public class Car {
    private String brand;
    private String model;
    public final int MAX_SPEED = 280;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo()
    {
        System.out.println("Brand: " + brand+" Model: " + model+" Speed: " + MAX_SPEED);
    }
}
