package practicequestions;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo1(7));
    }

    static int fibo1(int a) {

        if (a < 2) {
            return a;
        }
        return fibo1(a - 1) + fibo1(a - 2);


    }

    public static void main1(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}


