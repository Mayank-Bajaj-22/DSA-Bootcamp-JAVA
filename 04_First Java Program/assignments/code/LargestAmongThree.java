// Take 3 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is larger than " + num2 + " and " + num3);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is larger than " + num1 + " and " + num3);
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is larger than " + num1 + " and " + num2);
        }
    }
}
