package oct23;

import java.io.IOException;

public class ExceptionDemo14{
	public static void main(final String[] args) {
        try {
            System.out.println("Enter any character");
            final int ch = System.in.read();
            System.out.println((char)ch);
        }
        catch (IOException ex) {}
    }
}