package com.kodilla.calculator;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double c, double d) {
        return c - d;
    }

    public double multiplication (double e, double f) {
        return e * f;
    }

    public double division (double g, double h) {
        if (h != 0) {
            return g / h;
        } else {
            throw new IllegalArgumentException("Dont dive by zero");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(5,5));
        System.out.println(calculator.subtraction(10,5));
        System.out.println(calculator.multiplication(5,5));
        System.out.println(calculator.division(20,5));
    }
}
