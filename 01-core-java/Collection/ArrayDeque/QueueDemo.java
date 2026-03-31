package dsa.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		System.out.println("Initial Queue: " + queue);
		
		System.out.println("Removed element: " + queue.poll());
		
		System.out.println("Queue after removal: " + queue);


	}

}
