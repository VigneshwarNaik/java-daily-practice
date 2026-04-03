package dsa.hashset;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr={0,1,3,4};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num:arr) set.add(num);
		
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(i)) {
				System.out.println(i);
				return ;
			}
		}
	}

}
