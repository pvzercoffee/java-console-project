package com.pvzer.impl;

import com.pvzer.shape.Polygon;

public class Triangle extends Polygon {

    double x;
    double y;
    double z;

    public Triangle(int x, int y, int z) throws Exception {
        if(z > x+y || y > x+z || x > z+y || x < 0 || y < 0 || z < 0)
        {
            throw new Exception("不符合两边之和小于第三边！");
        };
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public boolean showArea() {
        if(x == 0 || y == 0 || z == 0) return false;
        double s = (x+y+z)/2;
        double result = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("三角形面积为："+result);
        return false;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        if(y+z < x || x < 0) return;
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        if(y+x < z || z < 0) return;
        this.z = z;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        if(x+z < y || y < 0) return;
        this.y = y;
    }
}
