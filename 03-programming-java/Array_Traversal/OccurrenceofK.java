
/*
 Question:
 ---------
 Write a Java program to read 'n' integers into an array.
 Then read a number 'k' and count how many times 'k' 
 occurs in the array.

 Example:
 Input:
 5
 2 3 2 5 2
 2

 Output:
 3   (because 2 appears 3 times)
*/
package Array;

import java.util.Scanner;

public class OccurrenceofK {

    public static int checkOccu(int[] arr, int k) {

        int count = 0;   

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == k) {
                count++;
            }
        }

        return count;  
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int res = checkOccu(arr, k);

        System.out.println(res);
    }
}
