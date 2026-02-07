//Java program to print a number pattern where the same row number is repeated in each row, forming an n × n pattern.

package Pattern_Matching;

public class NumH {

    public static void main(String[] args) {

        int n = 5;  // Number of rows and columns

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
