package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();

        int result = calculator.addAToB(8, 7);
        System.out.println(result);
        System.out.println("Test Succes");
        int result1 = calculator1.subtractAFromB(15, 7);

        System.out.println(result1);
        System.out.println("Test Succes");
    }
}
