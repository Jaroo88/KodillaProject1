package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    String shapeName = "Square";
    double sideA = 5;
    double sideB = 5;

    public Square(String shapeName){
        this.shapeName = shapeName;
    }

    public Square(int sideA,int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public String getShapeName() {
        return shapeName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(sideA, square.sideA) == 0 && Double.compare(sideB, square.sideB) == 0 && Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, sideA, sideB);
    }

    @Override
    public double getField() {
        return sideA * sideB;

    }
}
