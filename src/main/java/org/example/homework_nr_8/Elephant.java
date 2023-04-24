package org.example.homework_nr_8;

public class Elephant extends Herbivore implements Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Elephant(String name) {
        this.name = name;
    }

    @Override
    boolean eatHerbs() {
        return true;
    }

    @Override
    public void move() {
        System.out.println("I move");
    }

    @Override
    public void drink() {
        System.out.println("I drink");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }

    @Override
    public void run() {
        System.out.println("Elephant is running");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is  making sound...");
    }
}
