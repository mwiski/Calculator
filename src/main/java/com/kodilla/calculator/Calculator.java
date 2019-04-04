package com.kodilla.calculator;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double c, double d) {
        return c - d;
    }

    public double multiplication(double e, double f) {
        return e * f;
    }

    public double division(double g, double h) {
        if (h != 0) {
            return g / h;
        } else {
            throw new IllegalArgumentException("Dont dive by zero");
        }
    }

    public double fibonacci(double n) {
        if (n == 1 || n == 0)
            return 1;

        if (n < 0)
            throw new IllegalArgumentException("Number must be 0 or higher.");

        double n1 = 1, n2 = 1, n3 = 0;
        for (int i = 1; i < n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(5,5));
        System.out.println(calculator.subtraction(10,5));
        System.out.println(calculator.multiplication(5,5));
        System.out.println(calculator.division(20,5));
        System.out.println(calculator.fibonacci(1000));
    }
}
