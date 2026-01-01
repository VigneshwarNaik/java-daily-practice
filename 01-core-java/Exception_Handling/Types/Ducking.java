package types;
import java.util.Scanner;
class Ex{
	void dBoss() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nominator");
		int a=sc.nextInt();
		System.out.println("Enter Denominator");
		int b=sc.nextInt();
		System.out.println(a/b);
		
	}
}

public class Ducking {

	public static void main(String[] args) {
		try {
			Ex e=new Ex();
			e.dBoss();
		}
		catch(Exception e){
			System.out.println("Handling in main()");
		}
	}

}
