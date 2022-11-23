/*

2.	Implement Selection sort and find the sum of even numbers in an array?
*/

package dsa_Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //System.out.println(Arrays.toString(arr)); // for printing after each pass
        }
    }


    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 8, 3, 1};
        System.out.println("Selection Sort");
        System.out.println("Before: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After : " + Arrays.toString(arr));

        // find the sum of even numbers in an array
        int sum = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println("Sum of all even numbers in the array is : " + sum);


    }
}











