package oct23;

public class ExceptionDemo4
{
  private static void m1()
  {
    System.out.println("m1 started");
    int i = Integer.parseInt("p");
    System.out.println("m1 finished");
  }
  
  public static void main(String[] args)
  {
    System.out.println("main started");
    m1();
    int i = 12 / 0;
    System.out.println("main finished");
  }
}