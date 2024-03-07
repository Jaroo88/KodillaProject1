package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {


    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape figure) {
        shapes.add(figure);


    }

    public void removeFigure(Shape figure) {
        shapes.remove(figure);
    }

    public Shape getFigure(int number) {
        return shapes.get(number);
    }

    public void showFigures() {
        System.out.println("List of Figures:");
        for (Shape figure : shapes) {
            System.out.println(figure.getShapeName());
        }
    }

}