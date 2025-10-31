import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");

        float celsius = input.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit: " + fahrenheit);
    }
}
