// Factorial Program In Java
import java.util.Scanner;

public class Factorial {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int n = in.nextInt();
        int fact = 1;
        if (n < 0) {
            System.out.println("Not defined for negative integers");
        }
        else {
            for (int i = 1; i<=n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }
}
