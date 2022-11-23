/*

Q62.Write a program to convert very first character of every word 
	in Uppercase in a String.

*/
package assignmentQ62;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer s = new StringBuffer();
		char ch = ' ';
		String str = "pppp tttt";
		for (int i = 0; i < str.length(); i++) {
			if (ch == ' ' && str.charAt(i) != ' ')
				s.append(Character.toUpperCase(str.charAt(i)));
			else
				s.append(str.charAt(i));
			ch = str.charAt(i);

		}

		System.out.print(s.toString().trim());
	}

}
