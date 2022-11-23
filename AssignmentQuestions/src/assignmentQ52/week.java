/*
 Q52.Store name of weekdays in an array (starting from “Sunday” at 0 index).
Ask day position from user and print day name. Handle array index out of bound exception
and give proper message if user enter day index outside range (0-6).
*/
package assignmentQ52;

import java.util.Scanner;

public class week {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String prr[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", };
		System.out.println("Week days Names :- ");
		/*
		 * String arr[] = new String[8]; System.out.println(prr);
		 * 
		 * for (int i1 = 0; i1 < prr.length - 1; i1++) {
		 * System.out.println("Enter the week days: "); prr[i1] = sc.next();
		 * 
		 * }
		 */
		for (String x : prr) {
			System.out.println(x);
		}
		try {
			System.out.println("Which day you want to print?");
			int a = sc.nextInt();
			System.out.println(prr[a]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Try again with Entering a valid number between 0-6");
		}

	}

}
