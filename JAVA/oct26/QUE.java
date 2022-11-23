package oct26;

public class QUE {
	public static void main(String[] args) {
		int n = 50;
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println("ThrizzFizz");

			else if (i % 5 == 0)
				System.out.println("Fizz");

			else if (i % 3 == 0)
				System.out.println("Thrizz");

			else
				System.out.println(i);

		}
	}
}