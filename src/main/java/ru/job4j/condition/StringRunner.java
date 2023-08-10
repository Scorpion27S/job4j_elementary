package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        int idea = 11111;
        System.out.println(idea);
        int year = 2022;
        idea = idea + year;
        System.out.println(idea);
        idea += year;
        System.out.println("summ: " + idea);
        year -= idea;
        System.out.println("subtract: " + year);
        idea *= year;
        System.out.println("multiply: " + idea);
        year /= idea;
        System.out.println("divide: " + year);
    }
}