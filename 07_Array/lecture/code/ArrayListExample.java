import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax
        ArrayList<Integer> list = new ArrayList<>(5); // not need of 5 or size

//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.add(8765);

//        System.out.println(list);
//
//        System.out.println(list.contains(765432)); // boolean
//        list.set(0, 99);
//        System.out.println(list);

//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
//        }

        // preferred way to print ArrayList
        System.out.println(list);

    }
}
