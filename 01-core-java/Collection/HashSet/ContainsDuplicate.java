package dsa.hashset;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,2};
		
		HashSet<Integer> set = new HashSet<>();
		for(int num:arr) {
			if(set.contains(num)) {
				System.out.println("Duplicate exists: " + num);
				return;
			}
			set.add(num);
		}
		System.out.println("Duplicate not exists");
		
	}

}
