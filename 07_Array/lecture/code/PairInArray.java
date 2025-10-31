public class PairInArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12};
        printPairs(arr);

    }

    public static void printPairs(int[] arr) {
        int tp = 0;
        for (int i=0; i<arr.length; i++){
            int currentVal = arr[i];
            for (int j=i+1; j<arr.length; j++){
                System.out.print("(" + currentVal + ", " + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: " + tp);
    }
}
