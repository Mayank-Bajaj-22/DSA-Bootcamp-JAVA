// Take a number as input and print the multiplication table for it

import java.util.Scanner;

public class numberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print its table: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int table = i*number;
            System.out.println(table);
        }
    }
}
