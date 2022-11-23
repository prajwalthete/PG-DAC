package oct23;

import java.util.Scanner;

public class ExceptionDemo17
{
    private static void salary(final float sal) throws SalaryException {
        if (sal > 90000.0f) {
            System.out.println("sal = " + sal);
            return;
        }
        throw new SalaryException();
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        final float s = sc.nextFloat();
        try {
            salary(s);
        }
        catch (SalaryException e) {
            System.out.println(e);
        }
    }
}