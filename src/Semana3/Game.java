package Semana3;

import imonsh.*;

public class Game {
    public static void main(String[] args) throws InterruptedException{
        testAshe();
    }

    private static void testAshe() throws InterruptedException{
        Screen screen = new Screen();
        Jinx jinx = new Jinx(
                02,
                "Jinx",
                "Marksman",
                "Moderate",
                "A manic and impulsive criminal from Zaun, Jinx lives to wreak havoc without care for the consequences."
        );
        Ashe ashe = new Ashe(
                01,
                "Ashe",
                "Marksman",
                "Moderate",
                "Como Hija del Hielo y madre de guerra de la tribu Avarosa, Ashe comanda la más grande horda en el norte."
        );
        /*
        ashe.frostShot(screen);
        Thread.sleep(3000);
        ashe.crystalArrow(screen);
        Thread.sleep(3000);
        ashe.hawkShot(screen);

         */
        Runnable bombs = new Runnable() {
            @Override
            public void run() {
                try {
                    jinx.getExcited(screen);
                    Thread.sleep(3000);

                    jinx.switcheroo(screen);
                    Thread.sleep(3000);

                    jinx.zap(screen);
                    Thread.sleep(3000);

                    jinx.flameChompers(screen);
                    Thread.sleep(3000);

                    jinx.deathRocket(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try {
                    ashe.frostShot(screen);
                    Thread.sleep(3000);

                    ashe.hawkShot(screen);
                    Thread.sleep(3000);

                    ashe.volley(screen);
                    Thread.sleep(3000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(3000);

                    ashe.crystalArrow(screen);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread attackAshe = new Thread(attack);
        Thread attackJinx = new Thread(bombs);
        
        attackAshe.start();
        attackAshe.join();

        attackJinx.start();

    }
}
