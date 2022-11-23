package dsa_Searching;

import java.util.Scanner;

public class binarySearchLowerbound {
    private static int binarySearchLowerBond(int[] arr, int target) {
        int Left = 0;
        int Right = arr.length - 1;
        while (Left <= Right) {
            int mid = (Left + Right) / 2;

            if (arr[mid] == target) {
                if (mid - 1 >= 0 && arr[mid] == arr[mid - 1]) {
                    Right = mid - 1;
                } else {
                    return mid;
                }

            } else if (arr[mid] < target) {
                Left = mid + 1;
            } else if (arr[mid] > target) {
                Right = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 11, 17, 17, 18, 19, 20};

        // int[] arr = { 10, 11, 11, 11, 11, 16 };

        System.out.print("Enter target to search: ");
        int target = sc.nextInt();
        int index = binarySearchLowerBond(arr, target);
        if (index != -1)
            System.out.println("Key found at index: " + index);
        else
            System.out.println("Key not found.");
        sc.close();

    }

}