package org.example.homework_nr_2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number from 1 to 12 month you would like to choose");
        switch (console.nextInt()) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Choose another digit");
        }

        //------------------------------------------------------------------------
        System.out.println("-----------------------------------------------------");
        for(int i=100;i<=1000;i++){
            if(i%5==0){
                System.out.print(i+",");
            }
        }
        //------------------------------------------------------------------------
        System.out.println();
        System.out.println("-----------------------------------------------------");
        double result = 0;
        for (double i = 1; i < 100; i+=2) {
            result+=i/(i+2);
        }
        System.out.println(result);
        //------------------------------------------------------------------------
        System.out.println();
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
