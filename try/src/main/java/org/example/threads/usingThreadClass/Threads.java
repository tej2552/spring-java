package org.example.threads.usingThreadClass;

public class Threads extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi : "+i);
        }
    }
}
