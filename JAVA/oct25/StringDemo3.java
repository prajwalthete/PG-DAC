package oct25;

public class StringDemo3 {

	public static void main(String[] args) {
		char ar[] = { 'a', 'b' };
		char ar1[] = { 'c', 'd' };
		String s1 = new String(ar);
		String s2 = new String(ar);
		String s3 = new String(ar1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println("=====================");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		// == v/s equals() method in String object using new operator and constructor
	}

}
