package oct26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("E:\\DAC KOCHI\\ABC\\cdac.txt")) {
			String s = "-1FAMOUS CITY OF INDIA.";
			for (int i = 0; i < s.length(); i++) {
				fos.write(s.charAt(i));
			}
		}
		System.out.println("done");
	}

}
