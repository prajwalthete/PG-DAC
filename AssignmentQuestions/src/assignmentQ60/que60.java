/*
Q60.Write a program to reverse the given String.

*/

package assignmentQ60;

public class que60 {
	public static void main(String[] args) {
		
		String str="PRAJWAL";
		/*1st methodchar str1[]=str.toCharArray();
		for(int i=str1.length-1;i>=0;i--) {
			System.out.print(str1[i]);
		}*/
		
	/*2nd method	StringBuilder s=new StringBuilder();
		s.append(str);
		s=s.reverse();
		System.out.print(s);*/
	StringBuffer ss=new StringBuffer(str);
	ss.reverse();
	System.out.print(ss);

}
}