package dsa.hashset;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr={100,30,30,50,70,10,29};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int num:arr) {
			set.add(num);
		}
		
		System.out.println(set);
		
		int[] res=new int[set.size()];
		int i=0;
		for(int num:set) {
			res[i++]=num;
		}
		System.out.println(Arrays.toString(res));
	}

}
