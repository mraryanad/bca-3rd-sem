package fileHandling;

import java.io.*;

public class FileCopyExample {
    String Source = "source.txt";
    String Destination = "destination.txt";

    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("source.txt");
                FileOutputStream fos = new FileOutputStream("source.txt");) {
            int length = 0;
            byte[] buffer = new byte[1024];

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("Copied Successfully");
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
