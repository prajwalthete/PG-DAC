package dsa_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearchtakinginputfromuser {

	public static int binarySearching(int[] arr, int key) {
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		int n = sc.nextInt();
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
		Arrays.sort(array);
		System.out.println("Enter key to Search :  ");
		int key = sc.nextInt();

		int index = binarySearching(array, key);
		if (index != -1)
			System.out.println("Key found using binarySearch at index: " + index);
		else
			System.out.println("Key not found using binarySearch.");

		sc.close();
	}

}
