package Semana2.Hilos;

public class HilosT extends Thread {

    @Override //Runable
    public void run() {
        System.out.println("El hilo se está ejecutanto");
    }
    /*
    public void start() {
        //Iniciar la ejecución de un hilo
        //JVM manda a llamar el método run() de un hilo
    }
    */

    // sleep - detiene de manera temporal
    // join() - Espera a que un hilo muera
    // getPriority - Regresa la prioridad
    // setPriority - Establece la prioridad de un hilo
    // getName
    // getId - devuelve el id de un hilo
    // currenteThread, devuelve el hilo que se estpa ejecutando
    // Thread.state

    public static void main(String[] args) {
        HilosT hilo = new HilosT(); // Entra al state new
        hilo.start();
    }
}

 class HilosR implements Runnable {
     @Override
     public void run() {
         System.out.println("El hilo de runnable está corriendo");
     }

     public static void main(String[] args) {
         HilosR h = new HilosR();
         Thread t = new Thread(h);
         t.start();
     }
 }