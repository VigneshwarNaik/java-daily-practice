import java.util.ArrayList;
import java.util.Scanner;

public class Linear_search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		list.trimToSize();
		
		if(list.isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		
		int k = sc.nextInt();
//		int res = checkLinear(list, k);
		
		int res = list.indexOf(k);
		if(res!=-1) {
			System.out.println(res);
		}
		else {
			System.out.println("Invalid");
		}
		
		
		
	}
	public static int checkLinear(ArrayList<Integer> list,int k){
		for(int i=0;i<list.size();i++) {
			if(k==list.get(i)) {
				return i;
			}
		}
		return -1;
	}

}
