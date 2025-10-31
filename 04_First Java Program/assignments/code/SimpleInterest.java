// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter the rate: ");
        float rate = sc.nextFloat();

        System.out.print("Enter the time: ");
        float time = sc.nextFloat();

        float interest = (principal * rate * time) / 100;
        System.out.println("The interest is " + interest);
    }
}
