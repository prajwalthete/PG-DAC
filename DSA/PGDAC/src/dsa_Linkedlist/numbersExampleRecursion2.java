package dsa_Linkedlist;

public class numbersExampleRecursion2 {
	public static void main(String[] args) {
		// write a function which takes number and print it.
		// print first 5 number

		print(1);
	}

	static void print(int n) {
		System.out.println(n);

		if (n == 5) {
			return;
		}
		print(n + 1);

	}

}
