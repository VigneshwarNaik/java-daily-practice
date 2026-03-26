import java.util.Scanner;

public class Sum {
	
	public static int sumOfArray(int[] arr){
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=0) {
			System.out.println("Invalid array size");
			sc.close();
			return;
		}
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int res = sumOfArray(arr);
		System.out.println(res);
		sc.close();
	}

}
