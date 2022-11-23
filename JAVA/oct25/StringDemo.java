package oct25;

public class StringDemo {

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(s);

		char ar[] = { 'l', 'm', 'n', 'o' };
		String s1 = new String(ar); // creating string using construct
		System.out.println(s1);

		byte ar1[] = { 65, 66, 67, 68 };
		String s2 = new String(ar1);
		System.out.println(s2);

		char ch = '\u0064';
		System.out.println(ch);

		String s3 = new String(s);
		System.out.println(s3);

	}

}
