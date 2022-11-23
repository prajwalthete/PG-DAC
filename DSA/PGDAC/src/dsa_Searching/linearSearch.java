package dsa_Searching; //linearSearch

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static int linearSearching(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (key == arr[mid])
                return mid;
            if (key < arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();

        // creates an array

        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(" Entered Array elements are: ");
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        // int[] arr = { 88, 83, 66, 99, 11, 77, 22, 55, 11 };
        System.out.println("Enter key to Search :  ");
        int key = sc.nextInt();
        int index = linearSearching(array, key);

        if (index != -1) {
            System.out.println("key found using linearSearching at index : " + index);

        } else
            System.out.println("key not found using linearSearching ");

        int index1 = binarySearch(array, key);
        if (index != -1)
            System.out.println("Key found using binarySearch at index: " + index1);
        else
            System.out.println("Key not found using binarySearch.");

        sc.close();
    }
}
