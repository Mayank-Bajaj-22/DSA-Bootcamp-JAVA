// Calculate Commission Percentage

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();

        System.out.print("Enter Commission Amount: ");
        double commissionAmount = sc.nextDouble();

        double commissionPercentage = (commissionAmount / sellingPrice) * 100;

        System.out.println("Commission Percentage: " + commissionPercentage);

    }
}

// commission * 100 / selling price