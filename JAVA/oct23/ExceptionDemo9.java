package oct23;

import java.util.Scanner;

public class ExceptionDemo9 {
	public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        final int num = sc.nextInt();
        System.out.println("enter another");
        final int num2 = sc.nextInt();
        try {
            final int res = num / num2;
            System.out.println(res);
        }
        finally {
            System.out.println("closing resource");
            sc.close();
            System.out.println("resource closed");
        }
        System.out.println("closing resource");
        sc.close();
        System.out.println("resource closed");
    }

}
