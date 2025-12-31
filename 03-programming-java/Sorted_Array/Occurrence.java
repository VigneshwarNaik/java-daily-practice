/*
 Program:
 Read 'n' integers into an array and
 print how many times each number occurs.

 Example:
 Input:
 7
 2 1 2 3 1 2 3

 Output:
 1 - 2
 2 - 3
 3 - 2
*/


package programming;

import java.util.Arrays;
import java.util.Scanner;

public class Occurrence {
	
	public static void checkOccur(int[] arr){
		int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            Arrays.sort(arr);

            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + " - " + count);
                count = 1;
            }
        }

        System.out.println(arr[arr.length - 1] + " - " + count);

	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		checkOccur(arr);
	}

}
