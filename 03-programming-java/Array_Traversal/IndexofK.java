package Array;

import java.util.Scanner;

public class IndexofK {
    
    // This method returns the FIRST index where k is found in the array
    public static int checkIndex(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                return i;   
            }
        }
        return -1;  
    }
    
    
    
    // This method returns the LAST index where k is found in the array
    public static int lastIndex(int[] arr, int k) {
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == k) {
                return i;   
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        	
//        int res =checkIndex(arr, k);
        int res = lastIndex(arr, k);

        System.out.println(res);
    }
}
