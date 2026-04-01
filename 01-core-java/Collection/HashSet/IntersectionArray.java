package dsa.hashset;

import java.util.HashSet;

public class IntersectionArray {

	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int[] b={3,4,5,6};
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> res = new HashSet<>();
		
		for(int num:a) set.add(num);
		for(int num:b) {
			if(set.contains(num)) {
				res.add(num);
			}
		}
		System.out.println(res);
		
		
		
	}

}
