package Programming;

import java.util.Scanner;

public class Prime {
	
	public static boolean primeNum(int num){
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

	public static void checkPrime(int first,int last){
		for(int i=first;i<=last;i++) {
			if(primeNum(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void checkPrimeNum(int num){
		int count=0;
		for(int i=2;count<num;i++) {
			if(primeNum(i)) {
				System.out.println(i);
				count++;
			}
		}
	}
	
	public static void multipleOfntillx(int num ,int x){
		for(int i=x;i<=num;i++) {
			if(i%x==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=sc.nextInt();
		
		multipleOfntillx(num,x);
		
		
	}

}
