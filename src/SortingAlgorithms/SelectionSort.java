package SortingAlgorithms;

/***
 * the selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted part
 * and putting it at the beginning. The algorithm maintains two subarrays in a given array.
 * The subarray which is already sorted.
 * Remaining subarray which is sorted.
 */

public class SelectionSort {
    void sort(int arr[]) {
        int array1 = arr.length;

        for (int i = 0; i < array1 - 1; i++) {
            int minimum_index = i;
            for (int j = i + 1; j < array1; j++)
                if (arr[j] < arr[minimum_index])
                    minimum_index = j;

                int

        }
    }
}
