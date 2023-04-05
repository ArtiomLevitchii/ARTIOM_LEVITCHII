package org.example.homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {
        for (int i = 0; i < Months.values().length; i++) {
            System.out.println(Months.values()[i]);
            System.out.println(Weekday.FRIDAY.isHoliday());
        }
    }
}
