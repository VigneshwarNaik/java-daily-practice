package programming;

import java.util.Scanner;

/*
Question:
Given three arrays of integer values.
Write a program to merge these three arrays as shown in the output.

Input:
3
2 3 4
4
5 6 7 8
5
9 10 11 12 13

Output:
2 5 9 3 6 10 4 7 11 8 12 13
*/

public class ArrayMerge {

    public static int[] arrangeArray(int[] arr1, int[] arr2, int[] arr3) {
        int totalLength = arr1.length + arr2.length + arr3.length;
        int[] result = new int[totalLength];

        int i = 0, k = 0;

        // merge arrays alternately
        while (i < arr1.length || i < arr2.length || i < arr3.length) {
            if (i < arr1.length) {
                result[k++] = arr1[i];
            }
            if (i < arr2.length) {
                result[k++] = arr2[i];
            }
            if (i < arr3.length) {
                result[k++] = arr3[i];
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        int[] output = arrangeArray(arr1, arr2, arr3);

        for (int value : output) {
            System.out.print(value + " ");
        }
    }
}
