package oct25;

public class StringDemo4 {

	public static void main(String[] args) {
		String s = "Immutable Sequence Of Characters.";
		System.out.println(s);
		String s1 = s.toUpperCase();
		System.out.println(s1);
		String s2 = s.toLowerCase();
		System.out.println(s2);
		int len = s.length();
		System.out.println(len);
		int i = s.indexOf('S');
		System.out.println(i);
		int j = s.lastIndexOf('t');
		System.out.println(j);
		char ch = s.charAt(10);
		System.out.println(ch);
		String s3 = s.substring(10);
		System.out.println(s3);
		String s4 = s.substring(10, 18);
		System.out.println(s4);

	}

}
