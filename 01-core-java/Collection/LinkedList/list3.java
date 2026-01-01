package collection;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class list3 {
	public static void main(String[] args) {
		 LinkedList<Object> list = new LinkedList<>();
	        list.add(10);                  // Integer
	        list.add("Naik");              // String
	        list.add(false);               // Boolean
	        list.add(22.2f);               // Float
	        list.add(null);                // Null value
	        list.add(10000.7777);          // Double
	        list.add(0, "Vignesh");        // Insert at index 0
	        
	        for(int i=0;i<list.size();i++) {
	        		System.out.println(list.get(i));
	        }
	        System.out.println("\n");
	        
	        for(Object x:list) {
	        		System.out.println(x);
	        }
	        System.out.println("\n");
	        
	        Iterator<Object> cursor=list.iterator();
	        while(cursor.hasNext()) {
	        		System.out.println(cursor.next());
	        }
	        System.out.println("\n");
	        
	        ListIterator<Object> cursorr=list.listIterator(list.size());
	        while(cursorr.hasPrevious()) {
	        		System.out.println(cursorr.previous());
	        }

	}
}
