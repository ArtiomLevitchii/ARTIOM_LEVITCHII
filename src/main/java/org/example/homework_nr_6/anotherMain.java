package org.example.homework_nr_6;

public class anotherMain {
    public static void main(String[] args) {

        Invoice anotherInvoice = new Invoice("iPhone","Good phone",10,155.4);
        Invoice secondInvoice = new Invoice("Samsung","Good phone",-3,130.1);
        Invoice thirdInvoice =new Invoice("OnePlus","Phone",14,-2);

        System.out.println("First invoice: " + anotherInvoice.getAmount());
        System.out.println("Second invoice: " + secondInvoice.getAmount());
        System.out.println("Third invoice: " + thirdInvoice.getAmount());

        System.out.println("------------------------------------------------------");
        Date newDate = new Date(20,2,2024);
        newDate.displayDate();
        newDate.setDate(30);
        newDate.displayDate();
        newDate.setMonth(3);
        newDate.displayDate();
        newDate.setYear(-123);


    }
}
