package org.example.homework_nr_14;

import org.example.homework_nr_8.Animal;

import java.io.Serializable;

public class AnotherClass <T extends Comparable<T>,V extends Serializable & Animal,K extends Number>{
    T element;
    V element2;
    K element3;

    public AnotherClass(T element, V element2, K element3) {
        this.element = element;
        this.element2 = element2;
        this.element3 = element3;
    }
    public void printAllElements(){
        System.out.println("1st element - "+element+
                "\n2nd element - "+element2+
                "\n3rd element - "+element3);
        printTypes();
    }
    public void printTypes(){
        System.out.println("1st element type - "+element.getClass().getSimpleName()
        +"\n2nd element type - "+element2.getClass().getSimpleName()
        +"\n3rd element type - "+element3.getClass().getSimpleName());
    }
}
