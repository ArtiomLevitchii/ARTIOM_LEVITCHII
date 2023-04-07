package org.example.homework_nr_5;

public enum Weekday {

    MONDAY("WeekDay"),
    TUESDAY("WeekDay"),
    WEDNESDAY("WeekDay"),
    THURSDAY("WeekDay"),
    FRIDAY("WeekDay"),
    SUNDAY("DayOff"),
    SATURDAY("DayOff");
    private String index;
    Weekday(String index){
        this.index =index;
    }

    boolean isWeekDay(){
        return this.index.equalsIgnoreCase("WeekDay");
    }
    boolean isHoliday(){
        return this.index.equalsIgnoreCase("DayOff");
    }
}
