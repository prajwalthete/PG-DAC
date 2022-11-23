package oct23;

public class ExceptionDemo3
{
  public static void main(String[] args)
  {
    System.out.println("started");
    String[] ar = { "12" };
    try
    {
      String s1 = ar[0];
      String s2 = ar[1];
      int i = Integer.parseInt(s1);
      int j = Integer.parseInt(s2);
      int k = i / j;
      System.out.println(k);
    }
    catch (Exception e)
    {
      System.out.println(e.getMessage());
    }
    System.out.println("finished");
  }
}
