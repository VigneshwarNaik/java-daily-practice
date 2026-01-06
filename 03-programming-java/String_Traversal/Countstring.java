/*
 * Question:
 * Given a string s, write a program to count the number of
 * vowels, consonants, numerics and special characters in the string.
 *
 * Example:
 * Input:  Hello#321
 * Output:
 * vc = 2
 * cc = 3
 * nc = 3
 * spc = 1
 */
package programming;

import java.util.Scanner;

public class Countstring {
    
    public static void fun(String st){
        int vc=0,cc=0,nc=0,spc=0;
        
        for(int i=0;i<st.length();i++) {
            char ch=st.charAt(i);
            
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
                
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
                        || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vc++;
                }
                else {
                    cc++;
                }
            }
            else if(ch>='0' && ch<='9') {
                nc++;
            }
            else {
                spc++;
            }
        }
        System.out.println("Vowel count = " + vc);
        System.out.println("Consonant count = " + cc);
        System.out.println("Number count = " + nc);
        System.out.println("Special character count = " + spc);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        fun(st);
    }

}
