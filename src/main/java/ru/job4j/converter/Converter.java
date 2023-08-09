package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double in = 140;
        double expected = 2;
        double out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        double dollar = Converter.rubleToDollar(60);
        double in1 = 60;
        double expected1 = 1;
        double out1 = Converter.rubleToDollar(in1);
        boolean pass = expected1 == out1;
        System.out.println("60 rubles are 2. Test result : " + pass);
    }
}