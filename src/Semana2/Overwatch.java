package Semana2;

interface Healer {
    void doDamage();
    void heal();
    void extraSkill();
    static void healersStatement() {
        System.out.println("Healers gonna heal");
    }
    default void presentation() {
        System.out.println("Hello, I'm a healer");
    }
    default void checkUlt() {
        ultimateCharge();
    }
    private void ultimateCharge() {
        System.out.println("My ultimate is ready");
    }
}

class Zenyatta implements Healer {
    @Override
    public void heal() {
        System.out.println("Use the orb of Harmony on any ally");
    }

    @Override
    public void doDamage() {
        System.out.println("Throw orbs");
    }

    @Override
    public void extraSkill() {
        System.out.println("Use the orb of discord on any enemy");
    }
}

public class Overwatch {
    public static void main(String[] args) {
        Healer.healersStatement();
        Zenyatta Kai = new Zenyatta();
        Kai.presentation();
        Kai.heal();
        Kai.checkUlt();
        Kai.extraSkill();
        Kai.doDamage();
    }
}
