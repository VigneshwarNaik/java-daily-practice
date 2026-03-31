package collection;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Reverse {
	
	public static void reverseString(String str){
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(char ch:str.toCharArray()) {
			stack.addFirst(ch);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.removeFirst());
		}
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			String str=sc.nextLine();
			reverseString(str);
		}
	}

}
