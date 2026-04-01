import java.util.Iterator;
import java.util.TreeSet;
public class Tree1 {

	public static void main(String[] args) {
		TreeSet<Character> set=new TreeSet<>();
		set.add('a');
		set.add('c');
		set.add('d');
		set.add('b');
		set.add('a');
		
//		for(int i=0;i<set.size();i++) {
//			System.out.println(set.get(i)); do not having indexing
//		}
		
//		for(Object x:set) {
//			System.out.println(x);
//		}
		
		Iterator cursor=set.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
//		Iterator cursor = set.descendingIterator();
//		while(cursor.hasNext()) {
//			System.out.println(cursor.next());
//		}
	}

}
