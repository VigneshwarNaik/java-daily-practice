/*
Question:
Given two sorted arrays of integer values, write a program to merge these
two arrays such that the resultant array is also sorted.

Input:
5
3 5 7 9 13
8
1 2 3 4 9 15 17 19

Output:
1 2 3 3 4 5 7 9 9 13 15 17 19
*/
package programming;

import java.util.Scanner;

public class SortedArrayMerge {

    public static int[] arrangeArray(int[] arr1, int[] arr2) {

        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;
            } else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            res[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            res[k] = arr2[j];
            k++;
            j++;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] res = arrangeArray(arr1, arr2);

        // Print merged array
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
