// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the operator: ");
        String operator = sc.next();

        if (operator.equals("+")) {
            System.out.println(a + b);
        }
        else if (operator.equals("-")) {
            System.out.println(a - b);
        }
        else if (operator.equals("*")) {
            System.out.println(a * b);
        }
        else if (operator.equals("/")) {
            System.out.println(a / b);
        }
        else {
            System.out.println("Invalid operator");
        }
        sc.close();
    }
}
