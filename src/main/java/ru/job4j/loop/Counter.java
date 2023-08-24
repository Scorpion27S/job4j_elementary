package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int summ = 0; summ <= 5; summ++) {
            sum = sum + summ;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(11, 15));
        System.out.println(sum(66, 22));
        System.out.println(sum(0, 0));
    }
}