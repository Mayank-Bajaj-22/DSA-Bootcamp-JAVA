import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take complete line as an input
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        // Take integer as an input
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        // Take float as an input
        System.out.println("Enter Your Marks: ");
        float marks = sc.nextFloat();

        System.out.println("Enter Line: ");
        String line = sc.next();
        System.out.println(line);

        // output only first word because of next()
        // output complete line because of nextLine()

    }
}
