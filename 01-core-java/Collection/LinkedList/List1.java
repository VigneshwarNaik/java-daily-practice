package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<>();
		arr.add(10);
		arr.add("Tap");
		arr.add(null);
		arr.add(0,3);
		System.out.println(arr);
		
		LinkedList<Object> list=new LinkedList<>(arr);
		list.addFirst("Naik");
		list.addLast(100);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list.removeFirst());
		list.add("Ram");
		System.out.println(list.removeLast());
		list.removeLast();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list);
	}

}
