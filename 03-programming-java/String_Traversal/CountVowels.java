/*Write a Java program to count the number of vowels in a given string.
The program should read a string from the user and display 
how many vowels (a, e, i, o, u) are present in it.
*/

package com.tap.strings;

import java.util.Scanner;

public class CountVowels {
	
	public static int checkVowels(String st){
		int count=0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
					||ch=='A'|| ch=='E' || ch=='I'|| ch=='O' ||ch=='U') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int res=checkVowels(st);
		System.out.println(res);
	}

}
