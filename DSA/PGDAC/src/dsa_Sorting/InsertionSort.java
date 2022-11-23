package dsa_Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 4, 9, 7, 5, 2};
        System.out.println("BeforeSorting " + Arrays.toString(arr));
        insort(arr);
        System.out.println("AfterSorting " + Arrays.toString(arr));

    }

    public static void insort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j, temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];

            }
            arr[j + 1] = temp;

        }

    }

}
