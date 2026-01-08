package programming;

import java.util.Scanner;

public class CaseConversion {

    public static String toUpperCase(String st) {

        String t = "";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                t = t + (char) (ch - 32);
            } 
            else {
                t = t + ch;
            }
        }
        return t;
    }

    public static String toLowerCase(String st) {

        String t = "";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                t = t + (char) (ch + 32);
            } 
            else {
                t = t + ch;
            }
        }
        return t;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

//        String lower = toLowerCase(st);
//        System.out.println("Lowercase: " + lower);

        String upper = toUpperCase(st);
        System.out.println("Uppercase: " + upper);
    }
}
