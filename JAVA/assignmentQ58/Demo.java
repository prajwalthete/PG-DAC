/*
Q58.Input data exactly in the following format,
and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.   (Hint use String 

*/

package assignmentQ58;

public class Demo {

	public static void main(String[] args) {
		String s[] = { "1", "2", "3", "4", "5", "6", "7" };
		double sum = 0;
		for (String a : s) {
			int b = Integer.parseInt(a);
			sum += b;
		}
		System.out.println("Sum of Integers are:" + sum);

	}

}
