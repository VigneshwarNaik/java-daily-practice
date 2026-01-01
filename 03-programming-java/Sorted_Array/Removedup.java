/* 
 Question:
 Given a sorted array of n integers, 
 write a program to print all the elements of the array 
 without repeating (remove duplicates).

 Example:
 Input:
 n = 8
 array = 2 2 2 3 4 4 4 23
 
 Output:
 2 3 4 23
*/

package programming;
import java.util.Scanner;

public class Removedup {
	
    public static void checkEle(int[] arr){

        // Print the first element always
        System.out.println(arr[0]);

        // Print only when current element != previous element
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                System.out.println(arr[i]);
            }
        }
    }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        checkEle(arr);
    }
}
