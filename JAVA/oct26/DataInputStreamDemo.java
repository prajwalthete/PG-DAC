package oct26;

import java.io.FileNotFoundException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream("E:\\DAC KOCHI\\ABC\\cdac.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			int i = dis.readInt();
			String s = dis.readUTF();
			float f = dis.readFloat();
			System.out.println(i + " " + s + " " + f);
		}
		System.out.println("\ndone");
	}

}