package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private double radius = 6;
    private double liczbaPi =3.14;

    public Circle(double radius, double liczbaPi) {
        this.radius = radius;
        this.liczbaPi = liczbaPi;
    }
        public Circle(String shapeName){
            this.shapeName = shapeName;
        }

    @Override
    public String getShapeName() {
            return shapeName;
    }


    @Override
    public double getField() {
            return liczbaPi * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Double.compare(liczbaPi, circle.liczbaPi) == 0 && Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, radius, liczbaPi);
    }
}

