package collection;
import java.util.HashSet;
import java.util.Iterator;
public class Exhash {

	private static final boolean Integer = false;

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();//HashSet is a collection that stores objects, not primitives.

//Integer is a class, and like any object reference, it can hold null.
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(null);
		set.add(60);
		set.add(70);
//		System.out.println(set);
		
//		Without index not possible for loop
		
		for(Integer x:set) {
			System.out.println(x);
		}
		
		Iterator cursor=set.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
	}

}
