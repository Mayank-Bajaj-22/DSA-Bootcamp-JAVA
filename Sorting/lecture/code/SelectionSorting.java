import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last); // maxIndex = 0
            swap(arr, maxIndex, last); // arr , 0 , last = 4
        }
    }

    static void swap(int[] arr, int first, int second) {
        // arr , first = 0 , second = 4
        int temp = arr[first];  // temp = 5
        arr[first] = arr[second];  // arr[0] = 2
        arr[second] = temp;  // arr[4] = 5
        // {2, 3, 4, 1, 5}
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        // start = 0, end = 4
        int max = start;
        // max = 0;
        for (int i = start; i <= end; i++) {  // i = 0, 1, 2, 3, 4
            if (arr[max] < arr[i]) { // i = 0 ; 5 < 3 ; 5 < 2 ; 5 < 3 ; 5 < 4
                // for i = 0 , 3 : 2 < 3 ; 2 < 4 ; 2 < 1
                max = i;
            }
        }
        return max; // max = 0
    }
}
