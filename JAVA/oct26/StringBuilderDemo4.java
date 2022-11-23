package oct26;

//stringBuilder class methods : delete
public class StringBuilderDemo4 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcdefgh");
		s.delete(2, 5);
		System.out.println(s);
	}

}
// OP-abfgh