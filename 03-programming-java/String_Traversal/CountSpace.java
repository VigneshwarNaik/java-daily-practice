/* Write a Java program to count the number of spaces in a given string.
 Read the string from the user and display the total number of spaces present.
*/


package com.tap.strings;

import java.util.Scanner;

public class CountSpace {
	
	public static int checkString(String st){
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		int res=checkString(st);
		System.out.println(res);
	}

}
