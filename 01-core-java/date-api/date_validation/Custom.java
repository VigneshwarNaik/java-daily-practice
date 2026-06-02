package date_validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Custom {

	public static void main(String[] args) {
		String date="02-09-2002";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		try {
			LocalDate localDate = LocalDate.parse(date,formatter);
			
			System.out.println(localDate.format(formatter)+" is valid");
		}	
		catch(Exception e) {
			System.out.println(" is Invalid");
		}
		
		
	}

}
