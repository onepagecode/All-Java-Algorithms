package SortingAlgorithms;


import java.util.*;
import java.util.stream.IntStream;

class RadixSort {


    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            try {
                if (arr[i] > mx)
                    mx = arr[i];
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mx;
    }


    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);


        i = 0;
        while (i < n) {
            count[(arr[i] / exp) % 10]++;
            i++;
        }


        i = 1;
        while (i < 10) {
            count[i] += count[i - 1];
            i++;
        }


        i = n - 1;
        while (i >= 0) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
            i--;
        }


        i = 0;
        while (i < n) {
            arr[i] = output[i];
            i++;
        }
    }


    static void radixsort(int arr[], int n)
    {

        int m = getMax(arr, n);


        IntStream.iterate(1, exp -> m / exp > 0, exp -> exp * 10).forEachOrdered(exp -> countSort(arr, n, exp));
    }


    static void print(int arr[], int n)
    {
        IntStream.range(0, n).mapToObj(i -> arr[i] + " ").forEachOrdered(System.out::print);
    }


    public static void main(String[] args)
    {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;


        radixsort(arr, n);
        print(arr, n);
    }
}


