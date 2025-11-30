package com.pvzer.impl;

import com.pvzer.shape.Polygon;

public class Rectangle extends Polygon {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    @Override
    public boolean showArea() {
        System.out.println("矩形面积为："+(width*length));
        return false;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
