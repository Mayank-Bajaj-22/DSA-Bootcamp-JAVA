// Take 2 numbers as inputs and find their HCF anf LCM

import java.util.Scanner;

public class hcf_anf_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        // num1 = 9
        // num2 = 5

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int hcf = num1;

        int lcm = (a*b) / hcf;

        System.out.println("LCM = " + lcm);
        System.out.println("HCF = " + hcf);

    }
}

// hcf - highest common factor
// lcm - lowest common multiple

// num1 = 9
// num2 = 5

// 9 % 5 = 4
// 5 % 4 = 1
// 4 % 1 = 0 → So, HCF = 1
