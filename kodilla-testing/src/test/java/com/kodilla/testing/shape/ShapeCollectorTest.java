package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeCollectorTest {
    @Nested
    @DisplayName("Interface test")
    class InterfaceTest {

        @Test
        void getSquareName() {
            //Given
            Square square = new Square("Square");
            //When
            String result = square.getShapeName();
            //Then
            assertEquals("Square", result);

        }

        @Test
        void getSquareField() {
            //Given
            Square square = new Square(5, 5);
            //When
            double result = square.getField();
            //Then
            assertEquals(25, result);
        }

        @Test
        void getTriangleName() {
            //Given
            Triangle triangle = new Triangle("Triangle");
            //When
            String result = triangle.getShapeName();
            //Then
            assertEquals("Triangle", result);
        }

        @Test
        void getTriangleField() {
            Triangle triangle = new Triangle(8, 7);
            double result = triangle.getField();
            assertEquals(56, result);
        }

        @Test
        void getCircleName() {
            //Given
            Circle circle = new Circle("Circle");
            //When
            String result = circle.getShapeName();
            //Then
            assertEquals("Circle", result);
        }

        @Test
        void getCircleField() {
            //Given
            Circle circle = new Circle(10, 3.14);
            //When
            double result = circle.getField();
            //Then
            assertEquals(31.400000000000002, result);
        }
    }

    @Nested
    @DisplayName("ShapeCollector test")
    class TestShapeCollector {


        @Test
        void addFigure_shouldAddFigureToList() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();

            // When
            shapeCollector.addFigure(new Square(10, 10));
            shapeCollector.addFigure(new Circle(1, 3.14));

            // Then
            assertEquals(2, shapeCollector.getShapes().size());
        }

        @Test
        void removeFigure_shouldRemoveFigureFromList() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("square"));
            shapeCollector.addFigure(new Triangle("Triangle"));

            // When
            shapeCollector.removeFigure(new Triangle("Triangle"));

            // Then
            assertEquals(1, shapeCollector.getShapes().size());
        }

        @Test
        void getFigure_shouldReturnCorrectFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Square"));
            shapeCollector.addFigure(new Triangle("Triangle"));

            // When
            Shape result = shapeCollector.getFigure(0);

            // Then
            assertEquals("Square", result.getShapeName());
        }


        @Test
        void showFigures_shouldPrintCorrectOutput() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square("Square"));
            shapeCollector.addFigure(new Circle("Circle"));

            // When
            // Redirect System.out to capture printed output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            shapeCollector.showFigures();

            // Reset System.out
            System.setOut(System.out);

            // Then
            assertEquals("List of Figures:\r\nSquare\r\nCircle\r\n", outputStream.toString());


        }
    }
}
