// Take two numbers and print the sum of both

import java.util.Scanner;

public class sumTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
    }
}
