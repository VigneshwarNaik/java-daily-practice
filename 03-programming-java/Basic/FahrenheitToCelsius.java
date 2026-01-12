import java.util.Scanner;

public class FahrenheitToCelsius {

    /*
     * QUESTION:
     * Write a Java program to convert temperature from
     * Fahrenheit to Celsius using Scanner class.
     * Formula: Celsius = (Fahrenheit − 32) × 5/9
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System	tf.in);

        // Read temperature in Fahrenheit
        float f = sc.nextFloat();

        // Convert Fahrenheit to Celsius
        float c = (f - 32) * 5 / 9;

        // Print temperature in Celsius
        System.out.println(c);
    }
}
