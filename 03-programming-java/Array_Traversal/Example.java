package Array;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        // Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Declaring an integer array of size 5
        int[] arr = new int[5];

        // Reading elements into the array
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing array elements in original order
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Printing array elements in reverse order
        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Printing first half of the array
        System.out.println("First half of the array:");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Printing second half of the array
        System.out.println("Second half of the array:");
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Printing even elements from the array
        System.out.println("Even elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
