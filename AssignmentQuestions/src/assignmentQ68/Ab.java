/*
 ASSIGNMENT Q3 &
Q68. Write a program to count number of bytes in a image file(jpeg/png/gif).  Also
find how much time it will take to upload the file on server if internet speed is
256 bps(bits per second).
*/
package assignmentQ68;

import java.io.File;

public class Ab {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		File f = new File("E:\\DAC KOCHI\\ABC\\GYDF7407.JPG");
		if (f.exists()) {
			double bytes = f.length();
			double megabytes = (f.length() / 1024 * 1024);
			double speed = 256;// Kbps

			System.out.println("Total time that will take to upload the file on server : "
					+ (int) (bytes / speed / 60) + " secs" + " ");
			/*
			 *(Filesize in Mb / Upload Speed in Mbps) / (60) = Total Upload time in minutes
			 * 
			 * File Size     Upload Speed    Upload Time
				100 MB        5.0  Mbps           2 mins. 39 secs.  
				100 MB        1.5  Mbps           8 mins. 33 secs.  
				100 MB        256 Kbps           51 mins. 19 secs.
			 
			 */
			double time = speed * megabytes;
			System.out.println(("Total Nos. of Bytes in a image file: " + bytes));
			System.out.println(("Total Nos. of MegaBytes in a image file: " + megabytes));
		} else
			System.out.println("File doesn't exist");
	}

}
