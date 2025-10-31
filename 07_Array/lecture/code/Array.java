public class Array {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 22;

        // Q: store a person name
        String name = "Mayank Bajaj";

        // Q: store 5 roll numbers
        int r1 = 1;
        int r2 = 2;
        int r3 = 3;

        // syntax for array
        // datatype[] variable_name = new datatype[size];
        int[] arr = new int[5];
        // directly
        int[] arr2 = {1, 2, 3, 4, 5};

        int[] ros; // declaration of array , ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)
        System.out.println(ros[1]);

        String[] arr5 = new String[3];
        System.out.println(arr5[0]);
    }
}
