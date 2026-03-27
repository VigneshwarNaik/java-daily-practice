package dsa.linkedlist;

//import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Reverse {

	public static void main(String[] args) {
			
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		ListIterator<Integer> cursor = list.listIterator(list.size());
		
		while(cursor.hasPrevious()) {
			System.out.println(cursor.previous());
		}
		
		/*Collections.reverse(list);
		System.out.println(list);*/
	
	}

}
