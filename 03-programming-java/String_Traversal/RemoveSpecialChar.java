/*
 * Given a string s, write a program to remove
 * all the special characters from the string.
 *
 * Example:
 * Input:  He##o
 * Output: Heo
 */

package programming;

import java.util.Scanner;

public class RemoveSpecialChar {
		public static void checkChar(String st){
			
			String t="";
			for(int i=0;i<st.length();i++) {
				char ch=st.charAt(i);
				if((ch>'A' && ch<'Z') || (ch>'a' && ch<'z') ||(ch>=0 && ch<=10)) {
					t=t+ch;
				}
			}
			System.out.println(t);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		checkChar(st);
	}

}
