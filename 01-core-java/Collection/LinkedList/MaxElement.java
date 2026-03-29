package dsa.linkedlist;
import java.util.Collections;
import java.util.LinkedList;

public class MaxElement {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(40);
		
		int max=list.getFirst();
		
		for(int number:list) {
			if(number>max) {
				max=number;
			}
		}
//		Collections.max(list);
		
		System.out.println(max);
	}
}
