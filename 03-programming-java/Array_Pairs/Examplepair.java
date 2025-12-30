/*Question:
Write a Java program to read 'n' integers into an array and 
print all possible unique pairs of elements from the array.
*/

package Array;
import java.util.Scanner;
public class Examplepair {
	
	public static void checkPair(int arr[]){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		checkPair(arr);
	}

}
