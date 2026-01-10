
/*
 Question:
 ---------
 Write a Java program to read 'n' numbers into an array and 
 find the INDEX of the largest (maximum) element in the array.

 Example:
 Input:
 5
 3 9 1 6 2

 Output:
 1   ← because 9 is the largest and its index is 1
*/

package Array;
import java.util.Scanner;
public class Largeleind {
    
    public static int checkIndex(int arr[]) {

        int max = Integer.MIN_VALUE;  
        int index = 0;                
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > max) {
                max = arr[i];   
                index = i;      
            }
        }
        
        return index;  
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int res = checkIndex(arr);
        
        System.out.println(res);
    }
}
