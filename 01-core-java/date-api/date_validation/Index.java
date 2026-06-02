package date_validation;

import java.time.LocalDate;

public class Index {

	public static void main(String[] args) {
		String date="2026-09-02";
		
		try {
			LocalDate localDate = LocalDate.parse(date);
			System.out.println(localDate+" is valid");
		}catch(Exception e) {
			System.out.println(date+" is not valid");
		}
	}

}
