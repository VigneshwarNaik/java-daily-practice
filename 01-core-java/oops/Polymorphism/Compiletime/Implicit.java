package Polymorphism;

class Calculator{
	
	// Method 1: accepts byte and char
	void add(byte a,char b){
		System.out.println("byte , char");
	}
	
	// Method 2: accepts int and char
	void add(int a,char b){
		System.out.println("int , char");
	}
}

public class Implicit {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
//		char → int (NOT char → byte)
		c.add('A', 'B');
	}

}
