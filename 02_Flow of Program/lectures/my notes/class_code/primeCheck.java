import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int c = 2;
        boolean isPrime = true;
        while (c < num) {
            if (num % c == 0) {
                isPrime = false;
                break;
            }
            c = c + 1;
        }

        if (isPrime) {
            System.out.print("Prime number");
        }
        else {
            System.out.print("Not Prime number");
        }
    }
}
