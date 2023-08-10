package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(float value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = (float) Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = (float) Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float dollar = (float) Converter.rubleToDollar(60);
        System.out.println("60 rubles are " + dollar + " dollar.");
        float in1 = 60;
        float expected1 = 1;
        float out1 = (float) Converter.rubleToDollar(in1);
        boolean pass = expected1 == out1;
        System.out.println("60 rubles are 2. Test result : " + pass);
    }
}