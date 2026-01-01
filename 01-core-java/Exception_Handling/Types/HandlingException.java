package types;

import java.util.Scanner;

public class HandlingException {
	
	void fun1(){
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int a=sc.nextInt();
			System.out.println("Enter the Demoninator");
			int b=sc.nextInt();
			int res=a/b;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
}
class Demo{
	
	public static void main(String[] args) {
		HandlingException h=new HandlingException();
		h.fun1();
	}

}
