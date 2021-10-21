package SortingAlgorithms;

import java.util.Arrays;

/****
 * It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
 * The merge() function is used for merging two halves.
 */

/* Java program for Merge Sort */
class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        {
            try {
                int i = 0;
                while (i < n1) {
                    L[i] = arr[l + i];
                    ++i;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        {
            try {
                int j = 0;
                while (j < n2) {
                    R[j] = arr[m + 1 + j];
                    ++j;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        if (i < n1 && j < n2) {
            do {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            } while (i < n1 && j < n2);
        }

        /* Copy remaining elements of L[] if any */
        while (true) {
            if (i >= n1) break;
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (true) {
            if (j >= n2) break;
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        try {
            if (l < r) {
                // Find the middle point
                int m =l+ (r-l)/2;

                // Sort first and second halves
                sort(arr, l, m);
                sort(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        Arrays.stream(arr).mapToObj(j -> j + " ").forEachOrdered(System.out::print);
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 345,345,23,423,34,532,4554,6,76,54,324,32,34,56 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra */

