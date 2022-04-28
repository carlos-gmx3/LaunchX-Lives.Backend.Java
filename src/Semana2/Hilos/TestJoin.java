package Semana2.Hilos;

public class TestJoin extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.print(this.getName());
            System.out.println(" " + i);
        }
    }

    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();
        showDetails(t1, t2, t3);

        t1.start();

        try {
            t1.join(1500);
            t1.setName("LaunchX");
            t1.setPriority(MAX_PRIORITY);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        t2.start();
        t3.start();
    }

    public static void showDetails(TestJoin t1, TestJoin t2, TestJoin t3) {
        System.out.print("Hilo 1: " + t1.getName());
        System.out.print(" Id: " + t1.getId());
        System.out.print(" Estado " + t1.getState());
        System.out.println(" Prioridad " + t1.getPriority());

        System.out.print("Hilo 2: " + t2.getName());
        System.out.print(" Id: " + t2.getId());
        System.out.print(" Estado " + t2.getState());
        System.out.println(" Prioridad " + t2.getPriority());

        System.out.print("Hilo 3: " + t3.getName());
        System.out.print(" Id: " + t3.getId());
        System.out.print(" Estado " + t3.getState());
        System.out.println(" Prioridad " + t3.getPriority());
    }
}
