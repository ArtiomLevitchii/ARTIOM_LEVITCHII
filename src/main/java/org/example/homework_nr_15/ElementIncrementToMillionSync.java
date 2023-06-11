package org.example.homework_nr_15;

import java.util.concurrent.TimeUnit;

public class ElementIncrementToMillionSync {
    public static void main(String[] args) {
        ElementIncrementSync elementIncrementSync = new ElementIncrementSync(0);
        Consumer consumer = new Consumer(elementIncrementSync);

        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
class ElementIncrementSync{
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public ElementIncrementSync(int i){
        this.i=i;
    }

}
class Consumer implements Runnable{
ElementIncrementSync elementIncrementSync;
public Consumer(ElementIncrementSync elementIncrementSync){
    this.elementIncrementSync=elementIncrementSync;
}
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            elementIncrementSync.setI(elementIncrementSync.getI()+1);
            System.out.println("I = "+ elementIncrementSync.getI()+"-> from thread -> "+Thread.currentThread().getName());

        }
    }
}


