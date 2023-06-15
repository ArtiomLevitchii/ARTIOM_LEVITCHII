package org.example.homework_nr_14;

import org.example.homework_nr_8.Animal;

public class Main {
    public static void main(String[] args) {
        AnotherClass<String,Integer,Double> anotherClass = new AnotherClass<>("Hello world",22,3.1415);
        anotherClass.printAllElements();
    }
}
