package oct26;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("E:\\DAC KOCHI\\ABC");
		System.out.println(f.exists());
		boolean b = f.mkdir();
		if(b) {
			System.out.println("created successfully");
		}else {
			System.out.println("folder with given name is already exists");
		}
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory()); 
	}

}
