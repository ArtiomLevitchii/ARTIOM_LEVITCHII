package org.example.homework_nr_8;

public interface Animal {
    void move();
    void drink();
    void eat();
    void run();
    default void makeSound(){
        System.out.println("Animal is making sound...");
    }
    static void sleep(){
        System.out.println("I am sleeping");
    }
}
