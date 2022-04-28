package Semana1.Viernes;

class Bike2 {
    void run() {
        System.out.println("Running...");
    }
}
//
public class Polimorfismo extends Bike2 {
    @Override
    void run() {
        System.out.println("Running slower...");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Bike2();

        // Upcasting o ligadura dinámica
        Bike2 bike3 = new Polimorfismo();

        Polimorfismo bike4 = new Polimorfismo();
        bike2.run();
        bike3.run();
        bike4.run();
    }
}
