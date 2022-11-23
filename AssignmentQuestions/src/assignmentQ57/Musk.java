/*
Q57.Input name of a person and count how many vowels it contains.  Use String class functions.

*/
package assignmentQ57;

import java.util.Scanner;

public class Musk {
	public static void main(String args[]) {
		System.out.println("Enter String: ");
		Scanner sc=new Scanner(System.in);
	  int count=0;
	  String str=sc.nextLine();
	  for(int i=0;i<str.length();i++) {
		  if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
			  count++;
		  }
	  }
	  System.out.print("Total Number Of vowels is: "+count);
	}
}
