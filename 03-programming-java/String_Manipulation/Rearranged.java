/*
 * Question:
 * Write a Java program to rearrange the given string such that
 * all UPPERCASE letters come first,
 * followed by lowercase letters,
 * and then digits,
 * while maintaining the order of characters.
 *
 * Example:
 * Input : Hello@#$%WORLD12345
 * Output: HWORLDello12345
 */
package programming;

import java.util.Scanner;

public class Rearranged {

    public static String checkString(String st) {

        // To store uppercase characters
        String t1 = "";

        // To store lowercase characters
        String t2 = "";

        // To store numeric characters
        String t3 = "";

        for (int i = 0; i < st.length(); i++) {

            char ch = st.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                t1 = t1 + ch;
            }
            else if (ch >= 'a' && ch <= 'z') {
                t2 = t2 + ch;
            }
            // Check for digits
            else if (ch >= '0' && ch <= '9') {
                t3 = t3 + ch;
            }
        }

        // Combine all parts and return
        return t1 + t2 + t3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        String res = checkString(st);

        System.out.println(res);
    }
}
