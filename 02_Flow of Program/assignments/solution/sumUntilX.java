// Keep taking numbers as inputs till the user enters 'x', after that print sum of all

import java.util.Scanner;

public class sumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add. Type 'x' to stop and get the sum:");

        while (true) {
            String input = sc.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to exit.");
            }
        }

        System.out.println("Sum of all numbers: " + sum);
        sc.close();

    }
}

// Scanner sc.next() → takes input as a String (to allow checking for 'x')
// input.equalsIgnoreCase("x") → ends the loop if user types 'x' or 'X'
// Integer.parseInt(input) → converts valid input to an int
// If input is not a number or 'x', it shows an error message using try-catch.

