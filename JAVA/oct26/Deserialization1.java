package oct26;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fis = new FileInputStream("E:\\DAC KOCHI\\ABC\\cdac.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Manager1 emp = (Manager1) ois.readObject();
			System.out.println(emp);
		}
		System.out.println("\ndone");
	}

}