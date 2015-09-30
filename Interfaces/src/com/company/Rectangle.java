package com.company;

public class Rectangle implements Shape
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double area()
    {
        return this.width * this.height;
    }

    public String toString()
    {
        return "Rectangle";
    }
}
