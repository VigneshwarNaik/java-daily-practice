package Array;

import java.util.Scanner;

public class Max {

    // Method to find the largest element in the array
    public static int largeEle(int[] arr) {

        // Assume first element is the largest
        int larg = arr[0];

        // Compare with remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }
        }
        return larg;
    }

    // Method to find the smallest element in the array
    public static int smallEle(int[] arr) {

        // Assume first element is the smallest
        int small = arr[0];

        // Compare with remaining elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print largest element
        int max = largeEle(arr);
        System.out.println("Largest element = " + max);

        // Find and print smallest element
        int min = smallEle(arr);
        System.out.println("Smallest element = " + min);
    }
}
