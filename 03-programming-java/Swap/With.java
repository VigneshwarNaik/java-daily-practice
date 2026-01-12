import java.util.Scanner;

public class With {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // BEFORE swapping
        System.out.println("Before swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swapping using temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // AFTER swapping
        System.out.println("After swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
