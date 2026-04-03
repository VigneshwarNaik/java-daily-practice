package dsa.hashset;

//Find the first repeating element in an array.

import java.util.HashSet;

public class FirstRepeating {

	public static void main(String[] args) {
		int[] arr={5,3,4,3,5,6};
		
		if(arr==null || arr.length==0) {
			System.out.println("Invalid input");
			return;
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num:arr) {
			if(set.contains(num)) {
				System.out.println("First Repeating element is : "+num);
				return;
			}			set.add(num);
		}
		System.out.println("No repeating element");
	}

}
