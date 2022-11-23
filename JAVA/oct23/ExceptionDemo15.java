package oct23;

import java.io.IOException;

public class ExceptionDemo15{
		public static void main(final String[] args) {
			try 
			{
				m1();
			}
			catch (IOException ex) {}
    }
    
		static void m1() throws IOException {
			m2();
    }
    
		static void m2() throws IOException {
			System.out.println("Enter any character");
			final int ch = System.in.read();
			System.out.println((char)ch);
    }
}