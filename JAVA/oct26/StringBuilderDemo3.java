package oct26;

//stringBuilder class methods : replace

public class StringBuilderDemo3 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcdefgh");
		s.replace(2, 5, "ABCDEFGH");
		System.out.println(s);
	}

}
// OP- abABCDEFGHfgh