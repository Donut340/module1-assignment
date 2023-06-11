package com.assignment1.m3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();

        Triangle triangle1 = new Triangle(6, 4);
        triangle1.rotate90();
        shapes.add(triangle1);

        Triangle triangle2 = new Triangle(3, 4, 5);
        triangle2.rotate180();
        shapes.add(triangle2);

        shapes.add(new Circle(5));

        for (TwoDShape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
        }
    }
}
