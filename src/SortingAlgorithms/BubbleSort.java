package SortingAlgorithms;

/***
 * Bubble sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they
 * are in wrong order.
 */

public class BubbleSort {
    void bubblesort (int arr[]) {
        int array1 = arr.length;
        for (int i = 0; i < array1-1; i++)
            for (int j = 0; j < array1-i-1; j++)
                if (arr[j] >arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr [ j + 1] = temp;
                }
    }

    void DisplayArray (int arr[]){
        int array2 = arr.length;
        for(int i = 0; i< array2; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {7,23,54,2,65,4,32,35,23,54346,456474,32,2,0};
        ob.bubblesort(arr);
        System.out.println("The sorted array is:");
        ob.DisplayArray(arr);
    }
}
