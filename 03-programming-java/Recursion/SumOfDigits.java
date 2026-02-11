/*Java program to calculate the sum of digits of a given number using recursion.*/

package Interview;
import java.util.Scanner;

public class SumOfDigits {

    // Recursive method to find sum of digits
    public static int sumDigits(int num) {
        if (num == 0) {
            return 0; // base case
        }
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = sumDigits(num);
        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
