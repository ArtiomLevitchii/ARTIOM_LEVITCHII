package org.example.homework_nr_13;

public class anotherMain {
    public static void main(String[] args) throws InvalidRangeException {
        countDivisibleBy7Numbers(2,324);
        countDivisibleBy7Numbers(22,12);
    }
    public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        int counter=0;
        if(inferiorLimit>superiorLimit){
            throw new InvalidRangeException("Invalid range exception");
        } else {
            for (int i = inferiorLimit; i < superiorLimit; i++) {
                if(i%7==0){
                    counter++;
                }
            }
        }
        System.out.println("Numbers that divide by 7 in range "+inferiorLimit+":"+superiorLimit+" is = "+counter);
    }
}
