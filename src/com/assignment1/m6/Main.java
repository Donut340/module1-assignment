package com.assignment1.m6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to store TwoDShape objects (triangles and circles)
        List<TwoDShape> shapes = new ArrayList<>();

        // Create and add a red triangle to the list
        Triangle triangle1 = new Triangle(6, 4, Colour.RED);
        triangle1.rotate90();
        shapes.add(triangle1);

        // Create and add a green triangle to the list
        Triangle triangle2 = new Triangle(3, 4, 5, Colour.GREEN);
        triangle2.rotate180();
        shapes.add(triangle2);

        // Create and add a blue circle to the list
        shapes.add(new Circle(5, Colour.BLUE));

        // Loop through the list of shapes and print their characteristics and areas
        for (TwoDShape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
        }
    }
}