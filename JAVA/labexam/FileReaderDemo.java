package labexam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (FileReader fis = new FileReader("LAB EXAM.txt")) {
            int ch = -1;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        System.out.println("\ndone");
    }

}
