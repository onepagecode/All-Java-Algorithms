package SortingAlgorithms;

/***
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
 * The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the
 * correct position in the sorted part.
 */

public class InsertionSort {

    void insertionsort(int arr[]) {
        try {
            int array1 = arr.length;
            for(int i = 1; i< array1; ++i) {
                int InsertionKey = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > InsertionKey) {
                    arr[j + 1] = arr[j];
                    j = j - 1;

                }

                arr[j + 1] = InsertionKey;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void DisplayArray(int arr[]) {
        try {
            int Array1 = arr.length;
            int i = 0;
            while (i < Array1) {
                System.out.println(arr[i] + " ");
                ++i;
            }

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static void main(String args[]) {
        int arr[] = {423,234,345,34523,23,424,353,52,34,234,2435,43,55,534,23,423,42,32,3223,23,23,23,};

        InsertionSort ob = new InsertionSort();
        ob.insertionsort(arr);

        DisplayArray(arr);
    }
}
