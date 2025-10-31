// Input currency in rupees and output in USD.

import java.util.Scanner;

public class INR_to_USD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount in INR: ");
        double amount = sc.nextDouble();

        double USD = amount * 0.012;
        System.out.println("The USD is $" + USD);
    }
}
