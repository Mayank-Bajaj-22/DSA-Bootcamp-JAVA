// Calculate Average Of N Numbers

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to average: ");
        int n = in.nextInt();
        // Taking input from user till user does not press X or x

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = in.nextDouble();
            sum += num;
        }

        double average = sum / n;
        System.out.println("Average of the " + n + " numbers is: " + average);

    }
}
