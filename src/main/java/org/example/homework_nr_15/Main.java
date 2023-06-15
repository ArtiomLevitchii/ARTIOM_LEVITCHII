package org.example.homework_nr_15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(()->
                System.out.println("Hello from thread -> "+Thread.currentThread().getName()));
        thread.start();
        //------------------------------------------
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            threadList.add(new Thread(()->
                    System.out.println("Hello from thread nr -> "+Thread.currentThread().getName())));
        }
        for (Thread e :
                threadList) {
            e.start();
        }
    }
}
