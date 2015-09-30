package com.company;

public class Circle implements Shape
{
    private double rad;

    public Circle(double rad)
    {
        this.rad = rad;
    }

    public double area()
    {
        return 2 * Math.PI * this.rad;
    }

    public String toString()
    {
        return "Circle";
    }
}
