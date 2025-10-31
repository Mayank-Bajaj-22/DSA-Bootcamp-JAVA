import java.util.Scanner;

public class DistanceBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        int distance = firstNum - secondNum;
        System.out.print("The distance between " + firstNum + " and " + secondNum + " is " + distance);
    }
}
