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
        if(Weekday.values().equals("WeekDay"))
    }
    boolean isHoliday(){
        return Weekday.index.equals("DayOff");
    }
}
