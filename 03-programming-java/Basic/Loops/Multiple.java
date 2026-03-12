import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			if(i%a==0 || i%b==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
