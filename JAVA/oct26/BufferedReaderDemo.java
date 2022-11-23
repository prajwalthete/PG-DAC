package oct26;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileReader fis = new FileReader("E:\\DAC KOCHI\\ABC\\cdac.txt");
				BufferedReader br = new BufferedReader(fis)) {
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}
		System.out.println("\ndone");
	}

}