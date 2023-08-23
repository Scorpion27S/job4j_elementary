package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String budet;
        switch (day) {
            case 1:
                budet = "Понедельник";
                break;
            case 2:
                budet = "Вторник";
                break;
            case 3:
                budet = "Среда";
                break;
            case 4:
                budet = "Четверг";
                break;
            case 5:
                budet = "Пятница";
                break;
            case 6:
                budet = "Суббота";
                break;
            case 7:
                budet = "Воскресенье";
                break;
            default:
                budet = "Ошибка";
                break;
        }
        return budet;
    }
}