package dsa.linkedlist;
import java.util.Scanner;
import java.util.LinkedList;
public class PalindromeLL {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int n=sc.nextInt();
			if(n<=0) {
				System.out.println("Invalid");
				return;
			}
			
			LinkedList<Integer> list=new LinkedList<>();
			
			for(int i=0;i<n;i++) {
				list.add(sc.nextInt());
			}
			
			boolean isPalindrome=true;
			while(list.size()>1) {
				if(!list.removeFirst().equals(list.removeLast())) {
					isPalindrome=false;
					break;
				}
			}
			System.out.println(isPalindrome?"Palindrome":"Not Palindrome");
			
		}
	}

}
