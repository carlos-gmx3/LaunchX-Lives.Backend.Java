package Semana2;

abstract class Hola {
    void saludar() {
        //Como lo hace
        System.out.println("¿Como estás? Te ves bien eh");
    }

    abstract void saludo();
}

interface Mostrar {
    //Que hace
    void show();
    abstract void despide();
}



public class SaludosCordiales implements Mostrar{
    @Override
    public void show() {
        System.out.println("Hola prro");
    }

    @Override
    public void despide() {
        System.out.println("Gracias por participar");
    }

    public static void main(String[] args) {
        SaludosCordiales saludo1 = new SaludosCordiales();
        saludo1.show();
    }


}
