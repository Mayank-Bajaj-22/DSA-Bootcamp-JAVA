// Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Units: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 10;
        }
        else if (units < 200) {
            bill = units * 12;
        }
        else {
            bill = units * 15;
        }
        System.out.println(bill);
    }
}
