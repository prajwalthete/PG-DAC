package oct26;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		try (FileWriter fw = new FileWriter("E:\\DAC KOCHI\\ABC\\cdac.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			String s = "India is my country.";
			String s1 = "Mumbai the City of dreams.";
			bw.write(s);
			bw.newLine();
			bw.write(s1);
			// bw.flush();
		}
		System.out.println("done");
	}

}
