package oct23;

import java.io.IOException;

public class ExceptionDemo18
{
	 private static void m1() throws IOException {
	        System.out.println("m1 started");
	        System.out.println("Enter any char");
	        final int i = System.in.read();
	        System.out.println("m1 returning normally");
	    }
	    
	    private static void m2() throws IOException {
	        System.out.println("m2 started");
	        m1();
	        System.out.println("m2 returning normally");
	    }
	    
	    private static void m3() throws IOException {
	        System.out.println("m3 started");
	        m2();
	        System.out.println("m3 returning normally");
	    }
	    
	    public static void main(final String[] args) throws IOException {
	        System.out.println("main started");
	        m3();
	        System.out.println("main completed normally");
	    }
}