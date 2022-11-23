package recursionquestions;

public class abc {

    public static int findMaxRec(int[] A, int n) {
        // if size = 0 means whole array
        // has been traversed
        if (n == 1)
            return A[0];

        return Math.max(A[n - 1],findMaxRec(A, n - 1));
    }

    // Driver code
    public static void main(String[] args) {
        int[] A = {5, 1, 3, 2, 8, 9, 10};
        int n = A.length;

        // Function calling
        System.out.println(findMaxRec(A, n));
    }
}