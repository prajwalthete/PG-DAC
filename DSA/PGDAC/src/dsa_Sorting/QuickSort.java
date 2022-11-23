package dsa_Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void quickSort(int[] arr, int left, int right) {
        // 0. if partition has single element or invalid partition, return.
        if (left >= right)
            return;
        // consider left element as pivot -- arr[left]
        int i = left, j = right;
        while (i < j) {
            // 1. from left (i-index) find element greater than pivot.
            while (i <= right && arr[i] <= arr[left])
                i++;
            // 2. from right (j-index) find element less than or equal to pivot.
            while (arr[j] > arr[left])
                j--;
            // 3. if i less than j, swap ith element with jth element
            if (i < j)
                swap(arr, i, j);
        } // 4. repeat steps 1-3, till i < j
        // 5. swap jth element with pivot element
        swap(arr, j, left);
        // 6. apply quick sort to left partition - left to j-1
        quickSort(arr, left, j - 1);
        // 7. apply quick sort to right partition - j+1 to right
        quickSort(arr, j + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 1, 5, 3, 2, 6, 4};
//		int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

