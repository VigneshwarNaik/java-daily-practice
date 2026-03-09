
/*
 * Write a Java program to check whether a given number 
 * is even or odd using methods.
*/
import java.util.Scanner;

public class EvenOdd {
	
	public static boolean evenNum(int num){
		if(num%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean oddNum(int num){
		if(num%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(evenNum(num)) {
			System.out.println("Even");
		}
		else if(oddNum(num)){
			System.out.println("Odd");
		}
		else {
			System.out.println("Inavlid");
		}
	}

}
