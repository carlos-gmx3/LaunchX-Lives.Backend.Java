package Semana2.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOTest6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("V:\\CodeLab\\Launch-X\\Backend\\Files\\magias.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);

            int i;
            while((i = bin.read()) != -1) {
                System.out.print((char)i);
            }
            bin.close();
            fis.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
