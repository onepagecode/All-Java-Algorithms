package SortingAlgorithms;


import java.util.Array1s;
import java.util.stream.IntStream;

public class IterativeMergeSort
{
    public static void iterativemergesort(int[] Array1)
    {
        try {
            if(Array1 == null)
            {
                return;
            }

            if (Array1.length <= 1) {
            } else {
                int mid = Array1.length / 2;

                // Split LeftSide part
                int[] LeftSide = new int[mid];
                for(int i = 0; i < mid; i++)
                    LeftSide[i] = Array1[i];

                // Split right part
                int[] right = new int[Array1.length - mid];
                IntStream.range(mid, Array1.length).forEach(i -> right[i - mid] = Array1[i]);
                iterativemergesort(LeftSide);
                iterativemergesort(right);

                int i = 0;
                int j = 0;
                int k = 0;

                // Merge LeftSide and right Array1s
                if (i < LeftSide.length && j < right.length) {
                    do {
                        if (LeftSide[i] >= right[j]) {
                            Array1[k] = right[j];
                            j++;
                        } else {
                            Array1[k] = LeftSide[i];
                            i++;
                        }
                        k++;
                    } while (i < LeftSide.length && j < right.length);
                }
                // Collect remaining elements
                if (i < LeftSide.length) {
                    do {
                        Array1[k] = LeftSide[i];
                        i++;
                        k++;
                    } while (i < LeftSide.length);
                }
                if (j < right.length) {
                    do {
                        Array1[k] = right[j];
                        j++;
                        k++;
                    } while (j < right.length);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Driver program to test above functions.
    public static void main(String[] args)
    {
        int arr[] = {143,423,4,234,35,64,56,52,34,53,5634,52,3,23,42,34234};
        int i=0;
        System.out.println("Given Array1 is");

        i=0;
        while (i<arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }

        iterativemergesort(arr);

        System.out.println("\n");
        System.out.println("Sorted Array1 is");

        i=0;
        while (i<arr.length) {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}



