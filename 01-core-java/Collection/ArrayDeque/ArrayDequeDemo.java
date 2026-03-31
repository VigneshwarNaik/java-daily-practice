package dsa.arraydeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.offerFirst(10);
		deque.offerFirst(20);
		deque.offerLast(30);
		deque.offerLast(40);
		
		System.out.println(deque);
		
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		
		System.out.println(deque);
	}

}
