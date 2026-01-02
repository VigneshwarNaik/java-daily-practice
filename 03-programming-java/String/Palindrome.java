/*
 Question:
 Write a Java program to check whether a given string
 is a Palindrome or not.

 A string is a palindrome if it reads the same
 forward and backward.

 Example:
 Input  : madam
 Output : Palindrome

 Input  : hello
 Output : Not Palindrome
*/

package com.tap.strings;

import java.util.Scanner;

public class Palindrome {
	
	public static String checkPalindrome(String st){
		
		int i = 0, j = st.length() - 1;
		
		while(i < j) {
			if(st.charAt(i) == st.charAt(j)) {
				i++;
				j--;
			}
			else {
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		String res = checkPalindrome(st);
		System.out.println(res);
	}
}
