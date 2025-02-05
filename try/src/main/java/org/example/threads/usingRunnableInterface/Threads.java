package org.example.threads.usingRunnableInterface;

public class Threads implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello : " +i);
        }
    }
}
