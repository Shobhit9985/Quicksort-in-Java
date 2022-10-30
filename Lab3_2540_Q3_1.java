import java.util.Arrays;

public class Lab3_2540_Q3_1 {
    public static void main(String args[]) {

        int[] data = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        Lab3_2540_Q3.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));

        System.out.println("");

        int[] data2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data2));

        int size2 = data2.length;

        // call quicksort() on array data2
        Lab3_2540_Q3.quickSort(data2, 0, size2 - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data2));

        System.out.println("");

        int[] data3 = { 1, 2, 4, 5, 3, 7, 8, 10, 11, 9, 6
        };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data3));

        int size3 = data3.length;

        // call quicksort() on array data
        Lab3_2540_Q3.quickSort(data3, 0, size3 - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data3));
    }

}
