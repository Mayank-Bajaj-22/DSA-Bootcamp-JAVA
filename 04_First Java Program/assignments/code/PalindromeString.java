import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        String reversed = "";

        for(int i = name.length() - 1; i >= 0; i--){
            reversed += name.charAt(i);
//            System.out.print(name.charAt(i) + " ");
        }

        if(name.equals(reversed)){
            System.out.println(name + " is a Palindrome");
        }
        else{
            System.out.println(name + " is not a Palindrome");
        }
    }
}
