package com.kodilla.calculator;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double c, double d) {
        return c - d;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(5,5));
        System.out.println(calculator.subtraction(10,5));
    }
}
