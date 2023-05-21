package org.example.homework_nr_13;

public class Numbers {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        System.out.println("Your number is : "+numbers.DivisionBy(1));
        System.out.println("Your number is : "+numbers.DivisionBy(0));

    }
    public int DivisionBy(int x){
        if(x==0){
            throw new IllegalArgumentException("Invalid number");
        }else {
            return x;
        }
    }
}
