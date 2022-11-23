/*
Q66.Write a program to count how many times character ‘t’ occurs in a file. 

*/

package assignmentQ66;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountTheNumberOfts {
	public static void main(String[] args) throws IOException {

		String fileName = "E:\\DAC KOCHI\\ABC\\cdac.txt";
		String line = "";
		Scanner scanner = new Scanner(new FileReader(fileName));
		try {

			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				int counter = 0;

				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == 't') {
						counter++;

					}

				}

				System.out.println(counter);
			}
		} finally {

			scanner.close();

		}
	}

}
