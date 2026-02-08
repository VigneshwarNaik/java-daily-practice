/*Write a Java program to print numbers from 1 to n in each row, forming a square number pattern.

Example (n = 5):

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5*/

class Number {
    public static void main(String args[]) {
        int i, j;
        int n = 5;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
