package oct23;

public class ExceptionDemo5 {
	private static void m1()
	  {
	    System.out.println("m1 started");
	    @SuppressWarnings("unused")
		int i = Integer.parseInt("p");
	    System.out.println("m1 finished");
	  }
	 
	
	  public static void main(String[] args)
	  {
	    System.out.println("main started");
	    m1();
	    try
	    {
	      @SuppressWarnings("unused")
		int i = 12 / 0;
	    }
	    catch (ArithmeticException e)
	    {
	      System.out.println("catch of main");
	    }
	    System.out.println("main finished");
	  }
	}


