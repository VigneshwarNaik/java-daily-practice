package Exceptions;

import java.util.Scanner;

class InvalidUserException extends Exception{
	
	@Override
	public String getMessage() {
		return "Invalid Pin";
	}
}

class ATM{
	int pin=1234;
	int pUser;
	
	void acceptInput(){
		System.out.println("Enter the Pin");
		Scanner sc=new Scanner(System.in);
		pUser=sc.nextInt();
	}
	
	void vaidatePin() throws InvalidUserException{
		if(pin==pUser) {
			System.out.println("Collect Money");
		}
		else {
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}

class Bank{
	
	void initate(){
		ATM atm=new ATM();
		try {
			atm.acceptInput();
			atm.vaidatePin();
		}
		catch(Exception e){
			try {
				atm.acceptInput();
				atm.vaidatePin();
			}
			catch(Exception f) {
				try {
					atm.acceptInput();
					atm.vaidatePin();
				}
				catch(Exception g) {
					System.out.println("Card is blocked,Contact Pin");
				}
			}
		}
	}
	
}

public class Rbi {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.initate();
	}

}
