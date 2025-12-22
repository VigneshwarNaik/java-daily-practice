package Array;

import java.util.Scanner;

public class Oned {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the element: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the element for One dimension: ");
		
		for(int i=0;i<=n;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=1;i<=n;i++) {

			System.out.println("One Dimension are: "+arr[i]);
		}
		
		
	}

}
