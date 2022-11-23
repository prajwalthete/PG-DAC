package oct26;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args)throws IOException {
		File f = new File("E:\\DAC KOCHI\\ABC");
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath()); 
	}

}
