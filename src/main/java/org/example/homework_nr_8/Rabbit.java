package org.example.homework_nr_8;

public class Rabbit extends Herbivore implements Animal{
    @Override
    public void move() {
        System.out.println("Rabbit is moving");
    }

    @Override
    public void drink() {
        System.out.println("Rabbit is drinking");
    }

    @Override
    public void eat() {
        System.out.println("Rabbit is eating");
    }

    @Override
    public void run() {
        System.out.println("Rabbit is running");
    }

    @Override
    public void makeSound() {
        Animal.super.makeSound();
    }

    @Override
    boolean eatHerbs() {
        return false;
    }
}
