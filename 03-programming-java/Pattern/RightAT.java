//Java program to print a right-angled triangle star pattern.

package Pattern_Matching;

public class RightAT {

    public static void main(String[] args) {

        int n = 5;  // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
