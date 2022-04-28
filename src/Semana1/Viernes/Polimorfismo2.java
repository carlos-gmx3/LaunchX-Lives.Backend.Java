package Semana1.Viernes;

class Animal2 {
    void eat() {
        System.out.println("Comiendo...");
    }
}

class Dog extends  Animal2 {
    void eat() {
        System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Animal2 {
    void eat() {
        System.out.println("Tomando Leche");
    }
}

public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal2 dander;
        dander = new Animal2();
        dander.eat();
        dander = new Dog();
        dander.eat();
        dander = new Cachorro();
        dander.eat();
    }
}
