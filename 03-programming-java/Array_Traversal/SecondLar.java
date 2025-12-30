package Array;
import java.util.Scanner;
public class SecondLar {
	
	public static int checkEle(int[] arr){
		int larg=Integer.MIN_VALUE;
		int secLar=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>larg) {
				secLar=larg;
				larg=arr[i];
			}
			else if(arr[i]>secLar && arr[i]!=larg){
				secLar=arr[i];
			}
		}
		return secLar;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int res=checkEle(arr);
		System.out.println(res);
	}

}
