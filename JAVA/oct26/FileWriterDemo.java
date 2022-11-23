package oct26;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileWriter fos = new FileWriter("E:\\DAC KOCHI\\ABC\\cdac.txt")) {
			String s = "this is first line.";
			for (int i = 0; i < s.length(); i++) {
				fos.write(s.charAt(i));
			}
		}
		System.out.println("done");
	}

}
