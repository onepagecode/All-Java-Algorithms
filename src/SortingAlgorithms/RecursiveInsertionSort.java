package SortingAlgorithms;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void recursiveinsertionsort(int arr[], int array1) {

        do {
            try {
                if (array1 <= 1)
                    return;
            } catch (Exception e) {
                e.printStackTrace();
            }

            recursiveinsertionsort(arr, array1 - 1);

            int last = arr[array1 - 1];
            int j = array1 - 2;

            while (j >= 0 && arr[j] > last) {
                arr[ j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = last;
        } while (true);

    }

    public static void main(String[] args) {
        do {
            int arr[] = {34,345,345,45,6,6786,78,675,645,3,5,34,575,674,53,45};
            recursiveinsertionsort(arr, arr.length);
            System.out.println(Arrays.toString(arr));
        } while (true);
    }
}
