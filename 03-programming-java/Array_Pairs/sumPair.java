/*
 Question:
 Write a Java program to read 'n' integers into an array and
 print all pairs of elements whose sum is equal to a given value 'k'.

 Input:
 n → number of elements
 n integers → array elements
 k → target sum

 Output:
 All pairs (a, b) such that a + b = k
*/

package programming;

import java.util.Scanner;

public class sumPair {

    public static void checkPair(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) { // corrected j=i+1
                if (arr[i] + arr[j] == k) {
                    System.out.print(arr[i] + " " + arr[j]);
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        checkPair(arr, k);
    }
}
