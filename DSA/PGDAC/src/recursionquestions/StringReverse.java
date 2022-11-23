
/*
1. Write a program to find reverse of a string using recursion?
*/
package recursionquestions;

public class StringReverse {
    /* Function to print reverse of the passed string */
    void reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String str = "MUMBAI THE CITY OF DREAMS";
        StringReverse obj = new StringReverse();
        obj.reverse(str);
    }
}
