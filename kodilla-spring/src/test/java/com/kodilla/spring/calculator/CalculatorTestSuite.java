package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Calculator.class, Display.class})
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        // Given
        double a = 10;
        double b = 5;

        // When & Then
        calculator.add(a, b);
        calculator.sub(a, b);
        calculator.mul(a, b);
        calculator.div(a, b);
    }
}

