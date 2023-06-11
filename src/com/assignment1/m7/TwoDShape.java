package com.assignment1.m7;

// Abstract class to represent two-dimensional shapes
public abstract class TwoDShape {
    protected double width;
    protected double height;
    protected Colour colour;

    // Constructor with width, height, and colour parameters
    public TwoDShape(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    // Default constructor
    public TwoDShape() {
        this.width = 0;
        this.height = 0;
        this.colour = Colour.NONE;
    }

    // Abstract method to calculate the area of the shape
    public abstract double getArea();

    // Getter and setter methods for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter and setter methods for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter and setter methods for colour
    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
