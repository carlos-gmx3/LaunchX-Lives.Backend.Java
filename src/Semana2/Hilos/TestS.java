package Semana2.Hilos;

public class TestS extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestS h1 = new TestS();
        h1.start();
    }
}

class HilosS implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestS h2 = new TestS();
        h2.start();

        HilosS h3 = new HilosS();
        Thread hr3 = new Thread(h3);
        hr3.start();
    }
}
