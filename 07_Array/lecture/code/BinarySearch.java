public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14};
        int key = 2;
        int x = binary(arr, key);
        System.out.println(x);

    }

    public static int binary(int arr[], int key){
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid; // found
            }
            if (arr[mid] > key) {
                end = mid - 1; // left
            }
            if (arr[mid] < key) {
                start = mid + 1; // right
            }
        }
        return -1;
    }
}
