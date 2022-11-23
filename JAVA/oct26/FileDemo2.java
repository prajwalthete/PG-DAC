package oct26;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\DAC KOCHI\\ABC");
		System.out.println(f.exists());
		boolean b = f.createNewFile();
		if (b) {
			System.out.println("created successfully");
		} else {
			System.out.println("file with given name is already exists");
		}

		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}

}
