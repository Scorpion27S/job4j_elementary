package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie. ";
        int year = 2022;
        idea = idea + year;
        System.out.println(idea);

        idea += year;
        System.out.println("summ: " + idea);
        idea -= year;
        System.out.println("subtract: " + idea);
        idea *= year;
        System.out.println("multiply: " + idea);
        idea /= year;
        System.out.println("divide: " + idea);
    }
}