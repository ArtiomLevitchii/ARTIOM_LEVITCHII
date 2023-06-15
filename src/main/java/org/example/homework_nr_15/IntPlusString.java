package org.example.homework_nr_15;

public class IntPlusString {
    public static void main(String[] args) {
        IntOrStringWriter intOrStringWriter = new IntOrStringWriter();
        Consumer3 consumer3 = new Consumer3(intOrStringWriter);
        Consumer4 consumer4 = new Consumer4(intOrStringWriter);
        new Thread(consumer3).start();
        new Thread(consumer4).start();
    }
}
class IntOrStringWriter{
    private boolean flag = true;
    public synchronized void writeInteger() throws InterruptedException{
        while(!flag){
            wait();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        flag = false;
        notify();
    }
    public synchronized  void writeString()throws  InterruptedException{
        while(!flag){
            wait();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
        flag = true;
        notify();
    }
}
class Consumer3 implements Runnable{
    IntOrStringWriter intOrStringWriter;

    public Consumer3(IntOrStringWriter intOrStringWriter) {
        this.intOrStringWriter = intOrStringWriter;
    }

    @Override
    public void run() {
        try {
            intOrStringWriter.writeString();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Consumer4 implements Runnable{
    IntOrStringWriter intOrStringWriter;

    public Consumer4(IntOrStringWriter intOrStringWriter) {
        this.intOrStringWriter = intOrStringWriter;
    }

    @Override
    public void run() {
        try {
            intOrStringWriter.writeInteger();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

