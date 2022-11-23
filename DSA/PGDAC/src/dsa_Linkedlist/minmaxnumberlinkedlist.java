package dsa_Linkedlist;

public class minmaxnumberlinkedlist {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, -2, 8, 7, 6, 2, 5, 1};
        mini(arr, 0);
        System.out.println(find(arr, 0, 13));
    }

    public static int mini(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int ans = mini(arr, idx + 1);
        if (arr[idx] < ans) {
            ans = arr[idx];
        }

        return ans;
    }

    public static int maxi(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int ans = maxi(arr, idx + 1);
        if (arr[idx] > ans) {
            ans = arr[idx];
        }
        return ans;
    }

    public static boolean find(int[] arr, int idx, int data) {
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == data) {
            return true;
        }
        boolean ans = find(arr, idx + 1, data);
        return ans;
    }
}