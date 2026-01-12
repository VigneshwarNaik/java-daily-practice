    /*
     * QUESTION:
     * Write a Java program to convert temperature from
     * Celsius to Fahrenheit using Scanner class.
     * Formula: Fahrenheit = (Celsius × 9/5) + 32
     */
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read temperature in Celsius
        int c = scan.nextInt();

        // Convert Celsius to Fahrenheit
        float f = (c * 9.0f / 5) + 32;

        // Print temperature in Fahrenheit
        System.out.println(f);
    }
}
