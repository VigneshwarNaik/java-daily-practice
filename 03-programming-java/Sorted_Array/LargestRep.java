/*
 Given a sorted array of n integers,
 write a program to print the largest
 repeating element present in the array.

 Example:
 Input:
 10
 2 3 3 3 4 5 7 7 9 11
 
 Output:
 7
*/

package programming;

import java.util.Scanner;

public class LargestRep {
	
	public static int checkEle(int[] arr){
		
		// Traverse from end to start to get largest repeating element
		for(int i = arr.length - 1; i >= 1; i--) {
			if(arr[i] == arr[i - 1]) {
				return arr[i];
			}
		}
		return -1;  // if no repeating element
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = checkEle(arr);
		System.out.println(res);
	}
}
