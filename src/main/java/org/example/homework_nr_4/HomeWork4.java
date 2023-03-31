package org.example.homework_nr_4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class HomeWork4 {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////
        int[] integerArray = new int[10];

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i]=(int)(Math.random()*100);
            System.out.println("Array ["+i+"]"+": "+integerArray[i]);
        }
        ///////////////////////////////////////////////////////////////////////
        int[] oneDimensionalArray = new int[10];
        int[][] twoDimensionalArray = new int[3][3];
        int sumOfArray = 0;
        int odd = 0;
        int even = 0;


        for (int i = 0; i < oneDimensionalArray.length; i++) {
            oneDimensionalArray[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                twoDimensionalArray[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(twoDimensionalArray[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            sumOfArray+=oneDimensionalArray[i];
        }
        System.out.println("Sum of oneDimensionalArray = "+sumOfArray);
        System.out.println("Mid of oneDimensionalArray = "+sumOfArray/oneDimensionalArray.length);

        System.out.println("Even numbers in twoDimensionalArray : "+even);
        System.out.println("Odd numbers in twoDimensionalArray : "+odd);

        ////////////////////////////////////////////////////////////////////////////

        String[] stringArray = {"Alex","Artem","Max","Gherman","Pavel","Victor"};
        String[] newStringArray = new String[stringArray.length];
        System.arraycopy(stringArray, 0, newStringArray, 0, stringArray.length);
        for (String string : newStringArray) {
            System.out.println(string);
        }
    }
}
