package Semana1.Viernes;
class Animal {
    // Caso 1 reedefinir variable
    String color = "Blanco";

    // Caso 2 reedefinir metodos
    void eat() {
        System.out.println("Está comiendo");
    }

    //Caso 3 reedefinir constructores
    Animal() {
        System.out.println("Se crea un animal");
    }
}

class Gato extends Animal {
    // Caso 1 reedefinir variable
    String color = "Café";
    void printColor() {
        System.out.println("Color de la clase gato" + color);
        System.out.println("Color de la clase animal" + super.color);
    }

    // Caso 2 reedefinir metodos
    void eat() {
        System.out.println("Come atun");
    }
    void dormir() {
        System.out.println("Se durmió el michi");
    }
    void call() {
        super.eat();
        dormir();
    }

    //Caso 3 reedefinir constructores
    Gato() {
        super();
        System.out.println("Se creado un gato");
    }

}

public class SuperTest {
    public static void main(String[] args) {

        // Caso 1 reedefinir variable
        //new Gato().printColor();

        // Caso 2 reedefinir metodos
        //new Gato().call();

        // Caso 3 reedefinir metodos
        new Gato();
    }
}
