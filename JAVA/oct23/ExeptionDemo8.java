package oct23;

public class ExeptionDemo8 {
	private static void m1() {
        System.out.println("m1 started");
        try {
            Integer.parseInt("p");
        }
        catch (Exception e) {
            System.out.println("m1 catch");
        }
        System.out.println("m1 finished");
    }
    
    public static void main(final String[] args) {
        System.out.println("main started");
        try {
            m1();
        }
        catch (Exception e) {
            System.out.println("catch of main");
        }
        System.out.println("main finished");
    }

}
