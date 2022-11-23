
/*
Q2 Write a Java program that read from a file and write to file by handling all file related exceptions. **
*/
package labexam;

import java.io.FileWriter;
import java.io.IOException;

class Q2 {
    public static void main(String[] args) {
        try {
            // Creating a FileWriter object which will create a new file and if already available it will open it
            FileWriter fw = new FileWriter("EXAM.txt");
            fw.write("I LOVE INDIA ");   // write() method will write the string in the file
            fw.close();
            System.out.println("\nFile write SUCCESSFULLY  done");
        } catch (IOException e) {
          //  e.printStackTrace();
            // Print and display message
            System.out.println(
                    "There are some IOException");
        }
    }
}
