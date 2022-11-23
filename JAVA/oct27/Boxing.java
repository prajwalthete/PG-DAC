package oct27;

public class Boxing {

	public static void main(String[] args) {
		int i = 12;
		Integer ref = new Integer(i); // boxing
		System.out.println(ref);
		Integer ref1 = Integer.valueOf(i); // boxing
		System.out.println(ref1);
	}

}
