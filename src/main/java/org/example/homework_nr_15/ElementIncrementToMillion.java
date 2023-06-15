package org.example.homework_nr_15;

public class ElementIncrementToMillion {
    public static void main(String[] args) {
        ElementIncrement elementIncrement = new ElementIncrement(0);
        Thread thread = new Thread(elementIncrement);
        Thread thread1 = new Thread(elementIncrement);
        thread1.setName("Thread 2");
        thread.setName("Thread 1");
        thread.start();
        thread1.start();
    }
}
class ElementIncrement implements Runnable{
private int i;
public ElementIncrement(int i){
    this.i=i;
}
    @Override
    public void run() {
        while(this.i!=1000000){
            i++;
            System.out.println("Incremented i to : "+i+"/////////From thread -> "+Thread.currentThread().getName());
        }
    }
}
