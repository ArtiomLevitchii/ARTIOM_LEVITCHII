package org.example.homework_nr_7;

import org.w3c.dom.ls.LSOutput;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address=address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address=address;
    }
@Override
    public String toString(){
        return "Person[name = "+getName()+", address = "+getAddress()+"]";
    }
}
