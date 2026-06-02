package date_handling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sdf {

	public static void main(String[] args) {
		
//		Old version
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String newdate=sdf.format(date);
		
		System.out.println(newdate);
	}

}
