import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		int n1 = sc.nextInt();
		
		for(int i=0;i<n1;i++) {
			list1.add(sc.nextInt());
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int n2 = sc.nextInt();
		
		for(int i=0;i<n2;i++) {
			list2.add(sc.nextInt());
		}
		list1.addAll(list2);
		Collections.sort(list1);
		System.out.println(list1);
	}

}
