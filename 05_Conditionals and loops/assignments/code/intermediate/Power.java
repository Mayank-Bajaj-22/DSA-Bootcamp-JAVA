// Power In Java

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer for power: ");
        int integer = sc.nextInt();

        System.out.print("Enter the power of integer: ");
        int power = sc.nextInt();

        double result = Math.pow(integer, power);
        System.out.println(result);

//        M-2
//        int result = 1;
//
//        for (int i=1; i<=power; i++) {
//            result = result*integer;
//        }
//
//        System.out.println(result);

    }
}
