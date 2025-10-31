import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 22;
        arr[1] = 45;
        arr[2] = 65;
        arr[3] = 78;
        arr[4] = 90;
        // [22, 45, 65, 78, 90]

        System.out.println(arr[0]);

        // input using for loops
        for (int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

//        for(int num : arr) { // for every element in array
//            System.out.print(num + " "); // here num represents element of the array
//        }

        System.out.print(Arrays.toString(arr));

        System.out.println("\n");

        // array of objects
        String[] str = new String[4];
        for (int i=0; i<str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "mayank";
        System.out.println(Arrays.toString(str));
    }
}
