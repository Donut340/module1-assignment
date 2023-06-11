package com.assignment1.m2;

public class Triangle extends TwoDShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        super(side1, 0);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight());
    }

    private double heronsHeight() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return 2 * area / side1;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + width +
                ", height=" + height +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
