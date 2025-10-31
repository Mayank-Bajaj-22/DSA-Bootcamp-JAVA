// Calculate Depreciation of Value

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        double initialValue = sc.nextDouble();

        System.out.print("Enter salvage value: ");
        double salvageValue = sc.nextDouble();

        System.out.print("Enter useful life (in years): ");
        int usefulLife = sc.nextInt();

        double annualDepreciation = (initialValue - salvageValue) / usefulLife;

        System.out.println("The annual depreciation is " + annualDepreciation);
    }
}
