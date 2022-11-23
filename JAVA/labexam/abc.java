
/*Write a file handling program in Java with reader/writer.*/

package labexam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class abc {
    public static void main1(String[] args) throws IOException {
        // Accept a string
        String str = "MUMBAI IS THE DREAM CITY";

        // attach a file to FileWriter
        FileWriter fw = new FileWriter("LAB EXAM.txt");
        // read character wise from string and write into FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));

        System.out.println("Writing successfully Completed ");
        //close the file
        fw.close();
    }
}
