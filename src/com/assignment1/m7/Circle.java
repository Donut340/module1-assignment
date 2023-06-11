package com.assignment1.m7;

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
        // Calculate the area of the circle using the radius and PI
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
