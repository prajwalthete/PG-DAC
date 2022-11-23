/*
5. Write a program to read data from shopping.dat file created in above problem
and find total money spent on all shopping items. . (Use ObjectInputStream to
read Item class object).

*/
package fileassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class assignmentQ5 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream("E:\\DAC KOCHI\\ABC\\shopping.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p = (Person) ois.readObject();
			System.out.println(p);
		}
		System.out.println("done");
	}

}
