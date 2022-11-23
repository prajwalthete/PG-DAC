/*
3. Write a program to count number of bytes in a image file(jpeg/png/gif).  Also
find how much time it will take to upload the file on server if internet speed is
256 bps(bits per second).


*/
package fileassignment;

import java.io.File;

public class Ab {

	public static void main(String[] args) {
		File f = new File("E:\\DAC KOCHI\\ABC\\GYDF7407.JPG");
		if (f.exists()) {
			double bytes = f.length();
			double megabytes = (f.length() / 1024 * 1024);
			double speed = 256;
			double time = speed * megabytes;
			System.out.println(("Total Nos. of Bytes in a image file: " + bytes));
			System.out.println(("Total Nos. of MegaBytes in a image file: " + megabytes));
			System.out.println(("Total time that will take to upload the file on server:" + time));
		} else
			System.out.println("File doesn't exist");
	}

}
