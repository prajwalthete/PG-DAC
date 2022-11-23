package oct23;

import java.util.Scanner;

public class ExceptionDemo12 {

	public static void main(final String[] args) {
		Throwable t = null;
		try {
			final Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Enter day num");
				final byte dayNo = sc.nextByte();
				if (dayNo < 0 || dayNo > 7) {
					System.out.println("not a correct day no");
					throw new ArithmeticException();
				}
				System.out.println("ok");
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