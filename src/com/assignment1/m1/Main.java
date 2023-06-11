package com.assignment1.m1;

public class Main {
    public static void main(String[] args) {
        TwoDShape rectangle = new TwoDShape(10, 5);
        System.out.println("Rectangle area: " + rectangle.getArea());

        Triangle triangleFromBaseHeight = new Triangle(6, 4);
        System.out.println("Triangle area (from base and height): " + triangleFromBaseHeight.getArea());

        Triangle triangleFromSides = new Triangle(3, 4, 5);
        System.out.println("Triangle area (from sides): " + triangleFromSides.getArea());
    }
}
