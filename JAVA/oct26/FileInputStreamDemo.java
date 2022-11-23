package oct26;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fis = new FileInputStream("E:\\DAC KOCHI\\ABC\\cdac.txt")){
			int ch = -1;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch); 
			}
		}
		System.out.println("\ndone");
	}

}