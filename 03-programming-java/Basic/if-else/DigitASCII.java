/*
Question:
Check whether a given number is the ASCII code of a digit.

If the number is between 48 and 57, it represents a digit.
*/

import java.util.Scanner;

public class DigitASCII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		
		/*
		 * ASCII range for digits: '0' = 48 '9' = 57
		 */
		if(digit>=48 && digit<=57) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
