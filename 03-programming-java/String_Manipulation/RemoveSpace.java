package programming;

import java.util.Scanner;

public class RemoveSpace {

    // Method to remove leading and trailing spaces without using inbuilt trim()
    public static String trimSpace(String st) {

        int startingIndex = 0;
        int endingIndex = 0;

        // Find first non-space character from beginning
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ') {
                startingIndex = i;
                break;
            }
        }

        // Find last non-space character from end
        for (int i = st.length() - 1; i >= 0; i--) {
            if (st.charAt(i) != ' ') {
                endingIndex = i;
                break;
            }
        }

        String t = "";

        for (int i = startingIndex; i <= endingIndex; i++) {
            if(st.charAt(i)!=' ' ||(st.charAt(i)==' ' && st.charAt(i+1)!=' ')) {
            	t = t + st.charAt(i);
            }
        }

        return t; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String res = trimSpace(s);

        System.out.println(res);
    }
}
