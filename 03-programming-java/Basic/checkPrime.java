package Interview;

import java.util.Scanner;

public class checkPrime {
	
	public static void factor(int num){
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	
	public static int countFactor(int num){
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean primeCheck(int num){
		if(num<=1) {
			return false;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primeNum(int n,int m){
		for(int i=n;i<=m;i++) {
			if(primeCheck(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		primeNum(n,m);
	}

}
