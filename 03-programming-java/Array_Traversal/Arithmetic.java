package Array;

import java.util.Scanner;

public class Arithmetic {

    // Method to calculate addition of all array elements
    public static int addition(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Method to calculate subtraction of array elements
    public static int subtraction(int[] arr) {
        int sub = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sub = sub - arr[i];
        }
        return sub;
    }

    // Method to calculate multiplication of all array elements
    public static int product(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        return prod;
    }

    // Method to calculate division of array elements
    public static int division(int[] arr) {
        int div = arr[0];
        for (int i = 1; i < arr.length; i++) {

            // Avoid division by zero
            if (arr[i] == 0) {
                System.out.println("Division by zero is not allowed");
                return 0;
            }

            div = div / arr[i];
        }
        return div;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int add = addition(arr);
        int sub = subtraction(arr);
        int mul = product(arr);
//        int div = division(arr);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
//        System.out.println(div);

    }
}
