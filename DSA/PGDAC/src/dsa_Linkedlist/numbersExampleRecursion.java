package dsa_Linkedlist;

public class numbersExampleRecursion {
	public static void main(String[] args) {
		// write a function which takes number and print it.
		// print first 3 number

		print(1);
	}

	static void print(int n) {
		System.out.println(n);
		print1(2);

	}

	static void print1(int n) {
		System.out.println(n);
		print2(3);
	}

	static void print2(int n) {
		System.out.println(n);
		print3(4);
	}

	static void print3(int n) {
		System.out.println(n);
	}
}
