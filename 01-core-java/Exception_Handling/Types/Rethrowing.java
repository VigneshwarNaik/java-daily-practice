package types;
import java.util.Scanner;
 class Example{
	
	void disp() throws Exception{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the Nominator");
			int a=sc.nextInt();
			System.out.println("enter the Dinominator");
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Input are faulty");
			throw e;
		}
		finally {
			System.out.println("Done");
		}
	}
}
public class Rethrowing{
	
	public static void main(String[] args) {
		try {
			Example r=new Example();
			r.disp();
		}
		catch(Exception e){
			System.out.println("Handled exception in main()");
		}
	}

}
