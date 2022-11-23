
package dsa_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        // execute n-1 passes
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // compare consecutive elements
                // if left element is greater than right element, then swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void impBubbleSort(int[] arr) {
        // execute n-1 passes
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // compare consecutive elements
                // if left element is greater than right element, then swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void moreImpBubbleSort(int[] arr) {
        // execute n-1 passes
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapFlag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // compare consecutive elements
                // if left element is greater than right element, then swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapFlag = true;
                }
            }
            if (!swapFlag)
                break;
        }
    }

    public static void insertionSort(int[] arr) {
        // n-1 passes: in each pass consider ith element as last element of array
        for (int i = 1; i < arr.length; i++) {
            // copy last element into temp var
            int j, temp = arr[i];
            // compare temp will all elements before that, find appropriate position for the element and insert temp at that position
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 8, 3, 1};
        System.out.println("Before: " + Arrays.toString(arr));
        bubbleSort(arr);

        //  impBubbleSort(arr);
        //   moreImpBubbleSort(arr);
        //  insertionSort(arr);

        System.out.println("After : " + Arrays.toString(arr));
    }
}
