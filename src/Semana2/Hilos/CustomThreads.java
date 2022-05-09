package Semana2.Hilos;
import java.util.Scanner;

public class CustomThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new HelloThread(); //subclass of thread
        t1.start();

        Thread t2 = new Thread(new HelloRunnable());
        t2.start();
        t2.sleep(10);

        Thread t3 = new Thread(new HelloRunnable(), "kai-thread");
        t3.start();

        Thread t4 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            String helloMsg = String.format("Hello. I'm %s", threadName);
            System.out.println(helloMsg);
        });
        t4.start();

        Thread t5 = new HelloThread();
        t5.start();

        System.out.println("Do something useful");

        t5.join();

        System.out.println("Do something else");

    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        try {
            String helloMsg = String.format("Hello, I'm %s", getName());
            System.out.println(helloMsg);
        } catch (Exception ignored) {

        }
    }
}

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String helloMsg = String.format("Hello. I'm %s", threadName);
        System.out.println(helloMsg);
    }
}


