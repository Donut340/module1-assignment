package com.assignment1.m6;

// Circle class, a subclass of TwoDShape
public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    // Constructor with radius and colour parameters
    public Circle(double radius, Colour colour) {
        super(0, 0, colour);
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    // Method to return a string representation of the circle
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
