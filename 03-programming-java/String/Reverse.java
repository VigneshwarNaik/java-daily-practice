/*
 Question:
 Write a Java program to read a string from the user
 and print the reversed version of that string.

 Example:
 Input  : hello
 Output : olleh
*/

package com.tap.strings;

import java.util.Scanner;

public class Reverse {
    
    public static String reverseString(String s) {
        String t = "";    
        for(int i = s.length() - 1; i >= 0; i++) {
            t = t + s.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String res = reverseString(s);
        System.out.println(res);
    }
}
