package Semana2.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("V:\\CodeLab\\Launch-X\\Backend\\Files\\magicBuffer.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            String s = "Hola viajeros de \n Innovacción Virtual";
            byte[]b = s.getBytes();

            bout.write(b);
            bout.flush();

            bout.close();
            fos.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
