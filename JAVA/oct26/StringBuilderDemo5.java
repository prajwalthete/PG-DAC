package oct26;

//stringBuilder class methods : reverse
public class StringBuilderDemo5 {

	public static void main(String[] args) {
		String s = "abc";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
		System.out.println(s);
	}

}