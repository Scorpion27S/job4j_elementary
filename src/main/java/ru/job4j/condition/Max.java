package ru.job4j.condition;

public class Max {
    public static String max(int left, int right) {
        String result = left + right >= left ? "2" : "1";
        return result;
    }

    public static void main(String[] args) {
        String bolwe = Max.max(1, 2);
        System.out.println(bolwe);
    }
}