package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k, double l, double h) {
        double rsl = (l * h) / ((h * k)  * (p / (2 * (k + 1))));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2, 1, 1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);

    }
}