package dsa_Linkedlist;

public class last {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 2, 7, 1, 3, 5, 8};
        int target = 7;
        System.out.println("Target Found at index:  " + findLastIdx(arr, target, 0));
    }

    public static int findLastIdx(int[] arr, int target, int idx) {

        if (idx == arr.length) {
            return -1;  // -1: we haven't found our answer yet
        }

        int ans = findLastIdx(arr, target, idx + 1);

        if (ans != -1) {    // we found our ans
            return ans;
        } else {       /*
             we haven't found our answer yet
             if ( arr[idx] == target ) {
                 return idx;
             } else {
                 return -1;
             }
            */
            return arr[idx] == target ? idx : -1;   // ternary operator
        }
    }

}

