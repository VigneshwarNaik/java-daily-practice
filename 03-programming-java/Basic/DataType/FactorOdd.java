/*
Question:
Write a Java program to check whether M is a factor of N and whether M is odd.

Input:
Two integers M and N.

Output:
Print "Yes" if M is a factor of N and M is odd.
Otherwise print "No".
*/

import java.util.Scanner;

public class FactorOdd {
    
    // Method to check if M is a factor of N
    public static boolean factor(int M, int N){
        if(N % M == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Method to check if M is odd
    public static boolean odd(int M){
        if(M % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        // Check both conditions
        if(factor(M, N) && odd(M)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}