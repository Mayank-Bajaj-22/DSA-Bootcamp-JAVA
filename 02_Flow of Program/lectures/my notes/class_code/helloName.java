// Take a name and output Hello name

import java.util.Scanner;

public class helloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Hello " + name);
    }
}