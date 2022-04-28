package Semana2;

abstract class Sombra {
    abstract void dibujarSombra();
}

class Arma extends Sombra {
    @Override
    void dibujarSombra() {
        System.out.println("Dibuja una sombra azul");
    }
}

public class Personaje extends Arma {
    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        Sombra arma = new Arma();

        flecha.dibujarSombra();
        arma.dibujarSombra();
    }

    @Override
    void dibujarSombra() {
        System.out.println("Dibuja una sombra blanca");
    }
}
