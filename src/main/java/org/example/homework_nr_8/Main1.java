package org.example.homework_nr_8;

public class Main1 {
    public static void main(String[] args) {
        Animal newElephant = new Elephant("Слоник");
        newElephant.eat();
        newElephant.makeSound();
        Herbivore newElephant2 = new Elephant("Большой слоник");
        System.out.println("Elephant is eating herbs - " + newElephant2.eatHerbs());
        System.out.println(newElephant2.getStatus());
        ((Elephant) newElephant2).makeSound();

    }
}
