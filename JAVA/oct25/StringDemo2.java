package oct25;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "ab";
		String s3 = "cd";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println("================");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}

}
