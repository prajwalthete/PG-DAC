package dsa_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {

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
		int[] array = { 75, 83, 66, 99, 11, 77, 22, 55, 88 };
		Arrays.sort(array);
		System.out.println("Enter key to Search :  ");
		int key = sc.nextInt();

		int index = binarySearching(array, key);
		if (index != -1)
			System.out.println("Key found at index: " + index);
		else
			System.out.println("Key not found using binarySearch.");

		sc.close();
	}

}
