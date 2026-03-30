package dsa.stack;

import java.util.LinkedList;
import java.util.Scanner;

public class BalancedParentheses {

    /*
     * Question:
     * Write a Java program to check whether the given expression has balanced parentheses.
     * 
     * Requirements:
     * - Use LinkedList as a stack.
     * - Push opening brackets: '(', '{', '['
     * - When a closing bracket appears, pop from stack and check matching.
     * - If mismatch or stack is empty → return false.
     * - At the end, stack should be empty for a valid expression.
     * 
     * Example:
     * Input: "{[()]}"
     * Output: Balanced
     * 
     * Input: "{[(])}"
     * Output: Not Balanced
     */

    public static boolean isValid(String str) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char ch : str.toCharArray()) {

            // if opening → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.addFirst(ch);
            } 
            // if closing
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) return false;

                char top = stack.removeFirst();

                // check matching
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter expression: ");
            String str = sc.nextLine();

            if (isValid(str)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }
}