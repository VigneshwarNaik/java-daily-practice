package Exceptions;
import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int a=sc.nextInt();
			System.out.println("Enter the denominator");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid input");
		}
	}

}
