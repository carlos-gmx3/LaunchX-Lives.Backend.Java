package Semana2.IO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOTest2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("V:\\CodeLab\\Launch-X\\Backend\\Files\\magias.txt");
            String s = "magia!!";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
