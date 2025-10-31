import java.util.*;

public class largestNumber {
    public static void main(String[] args) {
        int arr[] = {12, 45, 85, 46, 99, 23};
        int x = getLargest(arr);
        System.out.println(x);

    }

    public static int getLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
            if(smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }
}
