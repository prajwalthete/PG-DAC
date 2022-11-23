package oct26;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileOutputStream fos = new FileOutputStream("E:\\DAC KOCHI\\ABC\\cdac.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeInt(123);
			dos.writeUTF("abc");
			dos.writeFloat(909.50f);
		}
		System.out.println("done");
	}

}
