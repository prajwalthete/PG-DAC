package oct23;

import java.util.Scanner;

public class ExceptionDemo11 {
	public static void main(final String[] args) {
		Throwable t = null;
		try {
			final Scanner sc = new Scanner(System.in);
			try {
				System.out.println("enter a num");
				final int num = sc.nextInt();
				System.out.println("enter another");
				final int num2 = sc.nextInt();
				final int res = num / num2;
				System.out.println(res);
			} finally {
				if (sc != null) {
					sc.close();
				}
			}
		} finally {
			if (t == null) {
				final Throwable exception = null;
				t = exception;
			} else {
				final Throwable exception = null;
				if (t != exception) {
					t.addSuppressed(exception);
				}
			}
		}
	}
}