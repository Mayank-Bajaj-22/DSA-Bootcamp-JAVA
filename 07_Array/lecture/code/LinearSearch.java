import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        // linear search
        int arr[] = {1, 5, 65, 89, 48, 33};
        int key = 75;
        int index = linear_search(arr, key);

        if(index == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + index);
        }

        String menu[] = {"dosa", "chole bhature", "samosa", "idli"};
        String choice = "samosa";
        int index1 = linear_search_String(menu, choice);
        if(index1 == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + index1);
        }


    }
    public static int linear_search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int linear_search_String(String[] menu, String choice) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == choice) {
                return i;
            }
        }
        return -1;
    }
}
