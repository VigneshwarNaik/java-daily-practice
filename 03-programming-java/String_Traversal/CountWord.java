package dsa.linkedlist;

import java.util.Scanner;

public class CountWord {
	
	public static int calculateCount(String st){
		int count=0;
		for(int i=0;i<st.length()-1;i++) {
			if(st.charAt(i)==' ' && st.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		return (st.charAt(0)==' ')?count:count+1;
		/*
		 * if(st.charAt(0)==' ') { 
		 * 	return count; 
		 * } 
		 * else { 
		 * 	return count+1; 
		 * }
		 */
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String st = sc.nextLine();
			int res = calculateCount(st);
			System.out.println(res);
		}
	}

}
