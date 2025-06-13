//Take input of a salary. If the salary is greater than 10,000 add bonus 2000, otherwise add bonus as 1000.

import java.util.Scanner;

public class salaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();

        if (salary >= 10000) {
            System.out.print(salary + 2000);
        }
        else {
            System.out.print(salary + 1000);
        }
    }
}