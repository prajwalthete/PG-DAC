package labexam;

public class Demo {


    static int findMinDiff(int[] arr, int n) {

        int diff = Integer.MAX_VALUE;


        for (int i = 0; i < n - 1; i++)
            for (int j = i+1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));


        return diff;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{19, 12, 7, 95, 15, 65, 20, 30};


        System.out.println("Minimum difference is 20-19= "
                + findMinDiff(arr, arr.length));
    }
}
