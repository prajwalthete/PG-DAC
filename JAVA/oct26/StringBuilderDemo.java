package oct26;

//StringBuilder class methods : insert

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcde");
		System.out.println(s);
		s.insert(2, "AB");
		System.out.println(s);
	}

}
/*
 * abcde 
 * abABcde
 */