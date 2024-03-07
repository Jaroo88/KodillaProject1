package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    double base = 7;
    double height = 8;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public Triangle(String shapeName){
        this.shapeName = shapeName;
    }


    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(height, triangle.height) == 0 && Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, base, height);
    }

    @Override
    public double getField() {
        return base * height;

    }
}

