// This program prints a square star pattern of size n.

package Pattern_Matching;

public class Square {

    public static void main(String[] args) {

        int n = 5;  // Size of the square

        // Outer loop for rows
        for (int j = 1; j <= n; j++) {

            // Inner loop for columns
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
