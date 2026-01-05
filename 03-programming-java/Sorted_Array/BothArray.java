/*
 Given two sorted arrays of integer values,
 write a program to print the elements
 which are repeated in both arrays.

 Example:

 Input:
 5
 3 5 6 8 9
 7
 2 3 4 6 7 8 8

 Output:
 3 6 8
*/

package programming;

import java.util.Scanner;

public class BothArray {
	
    public static void checkEle(int[] arr1,int[] arr2){

        int i = 0, j = 0;

        while(i < arr1.length && j < arr2.length){

            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for(int j = 0; j < arr2.length; j++){
            arr2[j] = sc.nextInt();
        }

        checkEle(arr1, arr2);
    }
}
