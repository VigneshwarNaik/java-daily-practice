//Write a Java program using Regex to validate an Indian mobile number.


package regEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Index {
	
	public static String fun1(String phNo){
		Pattern p=Pattern.compile("[6-9]\\d{9}");
		if(p.matcher(phNo).matches()) {
			return "Match found";
		}
			else {
				return "Match not found";
			}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phNo = sc.next();
		String res=fun1(phNo);
		System.out.println(res);
		sc.close();
	}

}
