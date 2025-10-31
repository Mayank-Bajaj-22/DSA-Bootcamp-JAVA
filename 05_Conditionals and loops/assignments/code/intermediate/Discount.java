// Calculate Discount Of Product

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = sc.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();

        double discountPrice = (originalPrice * discountPercentage) / 100;

        double finalPrice = originalPrice - discountPrice;

        System.out.println("Discount Amount: " + discountPrice);
        System.out.println("Final Price after Discount: " + finalPrice);

        sc.close();
    }
}

// (originalPrice * discountPercentage) / 100