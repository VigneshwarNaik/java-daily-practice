package collection;
import java.util.LinkedList;
public class Stack {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
	}
}
