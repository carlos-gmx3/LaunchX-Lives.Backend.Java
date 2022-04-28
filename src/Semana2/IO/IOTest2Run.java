package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2Run {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("V:\\CodeLab\\Launch-X\\Backend\\Files\\magiaRunnable.txt");
                    String s = "Runnable Magia!!";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                    System.out.println("Runnable Magia!!");
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        };
        Thread magic = new Thread(rm);
        magic.start();
    }
}
