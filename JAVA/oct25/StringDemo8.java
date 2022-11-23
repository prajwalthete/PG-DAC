package oct25;

public class StringDemo8 {

	public static void main(String[] args) {
		String s = "immutable sequence of characters.";
		String ar[] = s.split(" ");
		for (String a : ar) {
			System.out.println(a);

		}

	}
}