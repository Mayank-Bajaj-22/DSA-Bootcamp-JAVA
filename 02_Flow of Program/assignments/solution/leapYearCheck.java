// Input a year and find whether it is a leap year or not

import java.util.Scanner;

public class leapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year conditions:
        // 1. Divisible by 400 or
        // 2. Divisible by 4 and not divisible by 100

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is Leap Year");
        }
        else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}
