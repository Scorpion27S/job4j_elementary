package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class Calculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDelenie(double first, double second) {
        return minus(first, second)
                - delenie(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDelenie(double first, double second) {
        return sumAndMultiply(first, second)
                + minusAndDelenie(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDelenie(20, 10));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndMinusAndDelenie(20, 10));
    }
}