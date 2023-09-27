package com.systechafrica.part2.interfaces;

public class Square implements CalculateArea{

    @Override
    public double CalculateArea(double x, double y) {
        return x*y;
    }
   
}