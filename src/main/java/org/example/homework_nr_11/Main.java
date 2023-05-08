package org.example.homework_nr_11;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Function<String, Integer> functionIsVowel = e -> {
            int count = 0;
            for (int i = 0; i < e.length(); i++) {
                if (isVowel(e.charAt(i))){
                    count++;
                }

            }
            return count;
        };
        String charString = "artem";
        Integer x=functionIsVowel.apply(charString);
        System.out.println("Vowel letters in String "+charString+" = "+x);
        //---------------------------------------------------
        Function<String, Integer> functionIsConsonant = e -> {
            int count = 0;
            for (int i = 0; i < e.length(); i++) {
                if (!isVowel(e.charAt(i))){
                    count++;
                }

            }
            return count;
        };
        Integer z=functionIsConsonant.apply(charString);
        System.out.println("Consonant letters in String "+charString+" = "+z);
        //---------------------------------------------------
        Function<String,Integer> functionIsNumber = e -> {
            int count1 = 0;
            for (int i = 0; i < e.length(); i++) {
                if (isNumber(e.charAt(i))){
                    count1++;
                }

            }
            return count1;
        };
        String numberString = "1artem234";
        Integer y=functionIsNumber.apply(numberString);
        System.out.println("Numbers in String "+numberString+" = "+y);

        //-------------------------------------------------------
        Function<String,Character> checkForNumbers = e->{
            char[] charArray = e.toCharArray();
            if(e.length()%2==0)
                return null;
            return charArray[0];

        };

        Character character = checkForNumbers.apply(charString);
        System.out.println("OddOrEven in String "+charString+" = "+character);

        //------------------------------------------------------

        Predicate<String> checkForPalindrome= e->{
            char c;
            String temp="";
            for (int i = 0; i < e.length(); i++) {
                c=e.charAt(i);
                temp=c+temp;
            }

            return e.equalsIgnoreCase(temp);
        };
            String art="Artem";
            String ann="Anna";
        System.out.println("Word - "+ann+" is palindrome = "+checkForPalindrome.test(ann));
        System.out.println("Word - "+art+" is palindrome = "+checkForPalindrome.test(art));

        //----------------------------------------------------

        Predicate<Integer> checkForSimpleNumber = e->{
            BigInteger bigInteger = BigInteger.valueOf(e);
            return bigInteger.isProbablePrime(1);
        };

        int num=2;
        int num2=4;
        boolean temp = checkForSimpleNumber.test(num);
        boolean temp2 = checkForSimpleNumber.test(num2);
        System.out.println("Number - "+num+" - is simple - "+temp);
        System.out.println("Number - "+num2+" - is simple - "+temp2);

        //----------------------------------------------------

        List<Integer> listOfSimpleNumbers = new ArrayList<>();
        for (int i = 0; i < Byte.MAX_VALUE; i++) {
            if(checkForSimpleNumber.test(i)){
                listOfSimpleNumbers.add(i);
            }

        }
        System.out.println("List of simple numbers");
        System.out.println(listOfSimpleNumbers);

        //---------------------------------------------------

        }




    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'y';
    }
    public static boolean isNumber(char c){
        return c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9';
    }
}
