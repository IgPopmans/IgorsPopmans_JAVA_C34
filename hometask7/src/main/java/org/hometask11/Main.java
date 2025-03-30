package org.hometask11;

/**
 * @author Igors Popmans
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is stopped.");
    }
}
