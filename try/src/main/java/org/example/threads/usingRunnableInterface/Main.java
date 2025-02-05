package org.example.threads.usingRunnableInterface;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Threads());
        t1.start();
    }
}
