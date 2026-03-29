package dsa.stack;

import java.util.LinkedList;

public class ReverseStackLL {

	public static void main(String[] args) {
		LinkedList<Integer> stack=new LinkedList<>();
		stack.addFirst(10);
		stack.addFirst(20);
		stack.addFirst(30);
		
		System.out.println(stack);
		
		LinkedList<Integer> reverse=new LinkedList<>();
		
		while(!stack.isEmpty()) {
			reverse.addFirst(stack.removeFirst());
		}
		
		System.out.println(reverse);
		
	}

}
