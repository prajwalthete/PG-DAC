/*
Q63Write a program to reverse every word of the String.

*/
package assignmentQ63;

import java.util.Stack;

public class RRR {

	// reverses individual words of a string
	static void reverseWords(String str) {
		Stack<Character> st = new Stack<Character>();

		// Traverse given string and push all
		// characters to stack until we see a space.
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) != ' ')
				st.push(str.charAt(i));

			// When we see a space, we print
			// contents of stack.
			else {
				while (st.empty() == false) {
					System.out.print(st.pop());

				}
				System.out.print(" ");
			}
		}

		// Since there may not be space after
		// last word.
		while (st.empty() == false) {
			System.out.print(st.pop());

		}

	}

	public static void main(String[] args) {
		String str = "MUMBAI THE CITY OF DREAM";
		reverseWords(str);
	}
}