// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for series : ");
        int n = sc.nextInt();

        int a = 0, b = 1, next;

        if (n == 1) {
            System.out.print("Fibonacci series : " + a);
        }
        else {
            System.out.print("Fibonacci series : " + a + " " + b);

            for (int i = 3; i <= n; i++) {
                next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }
        sc.close();
    }
}
