import java.util.Scanner;

public class Without {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // BEFORE swapping
        System.out.println("Before swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swapping without temp
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // AFTER swapping
        System.out.println("After swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
