package org.example.homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {
        for (int i = 0; i < Months.values().length; i++) {
            System.out.println(Months.values()[i]);
        }

        //-------------------------------------------------------

        System.out.println(Weekday.MONDAY.isHoliday());
        System.out.println(Weekday.MONDAY.isWeekDay());

        //-------------------------------------------------------

        boolean stringOne = Boolean.parseBoolean("true");
        byte stringTwo = Byte.parseByte("120");
        short stringThree = Short.parseShort("32000");
        int stringFour = Integer.parseInt("147895632");
        long stringFive = Long.parseLong("987654321987654321");
        double stringSix = Double.parseDouble("4444.5d");
        float stringSeven = Float.parseFloat("2354.56f");

        System.out.println(stringSix);

    }
}
