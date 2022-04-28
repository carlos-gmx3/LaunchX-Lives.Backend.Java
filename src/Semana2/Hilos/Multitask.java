package Semana2.Hilos;

public class Multitask extends Thread {
    @Override
    public void run() {
        System.out.println("Tarea uno");
    }

    public static void main(String[] args) {
        Multitask t1 = new Multitask(),
                t2 = new Multitask(),
                t3 = new Multitask();

        t1.start();
        t2.start();
        t3.start();
    }
}

class Multitasking implements Runnable {
    @Override
    public void run() {
        System.out.println("Tarea Uno runnable");
    }

    public static void main(String[] args) {
        Thread t1m = new Thread(new Multitasking());
        Thread t2m = new Thread(new Multitasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        t1m.start();
        t2m.start();

        task1.start();
        task2.start();
    }
}

class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("Tarea A Runnable");
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        System.out.println("Tarea B Runnable");
    }
}
