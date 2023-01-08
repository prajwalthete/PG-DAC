import java.time.LocalDate;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello Everyone!");
        System.out.println(LocalDate.now());
        System.out.println("Enter your name");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Hello " + name);
    }
}