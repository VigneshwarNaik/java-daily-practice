package date_handling;

import java.util.Calendar;

public class Cal {

	public static void main(String[] args) {
		
		//Old version
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		System.out.println("Year :"+cal.get(Calendar.YEAR));
		System.out.println("Month :"+cal.get(Calendar.MONTH));
		System.out.println("Date :"+cal.get(Calendar.DATE));
	}

}
