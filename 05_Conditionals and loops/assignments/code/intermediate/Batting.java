// Calculate Batting Average

import java.util.Scanner;

public class Batting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        double totalRuns = sc.nextDouble();

        System.out.print("Enter number of innings: ");
        double innings = sc.nextDouble();

        double average = totalRuns / innings;
        System.out.print("Batting average is: " + average);
    }
}
