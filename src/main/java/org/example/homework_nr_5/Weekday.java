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

    Weekday(String index) {
        this.index = index;
    }

    public boolean isWeekDay() {
        if (this != SATURDAY || this != SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    boolean isHoliday() {
        if (this == SATURDAY || this == SUNDAY) {
            return true;
        } else {
            return false;
        }
    }
}
