package com.assignment1.m7;

// Triangle class, a subclass of TwoDShape, implementing the Rotate interface
public class Triangle extends TwoDShape implements Rotate {
    private double side1;
    private double side2;
    private double side3;
    private double angle;

    // Constructor with width, height, and colour parameters
    public Triangle(double width, double height, Colour colour) {
        super(width, height, colour);
    }

    // Constructor with side lengths and colour parameters
    public Triangle(double side1, double side2, double side3, Colour colour) {
        super(side1, 0, colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight());
        this.angle = 0;
    }

    // Private method to calculate the height of the triangle using Heron's formula
    private double heronsHeight() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return 2 * area / side1;
    }

    // Method to calculate the area of the triangle
    @Override
    public double getArea() {
        // Calculate the area of the triangle using the base and height
        return (width * height) / 2;
    }

    // Method to return a string representation of the triangle
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + width +
                ", height=" + height +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", angle=" + angle +
                '}';
    }

    // Rotate methods as defined in the Rotate interface
    @Override
    public void rotate90() {
        angle = (angle + 90) % 360;
    }

    @Override
    public void rotate180() {
        angle = (angle + 180) % 360;
    }

    @Override
    public void rotate(double degree) {
        angle = (angle + degree) % 360;
    }
}
