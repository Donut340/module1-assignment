package com.assignment1.m7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoDShapeTest {

    @Test
    public void testTriangleGetArea() {
        // Create a triangle with a base of 6 and a height of 4
        Triangle triangle = new Triangle(6, 4, Colour.RED);
        double expectedArea = 0.5 * 6 * 4;

        // Check if the calculated area matches the expected area
        assertEquals(expectedArea, triangle.getArea(), 0.001);
    }

    @Test
    public void testCircleGetArea() {
        // Create a circle with a radius of 5
        Circle circle = new Circle(5, Colour.BLUE);
        double expectedArea = circle.PI * 5 * 5;

        // Check if the calculated area matches the expected area
        assertEquals(expectedArea, circle.getArea(), 0.001);
    }
}
