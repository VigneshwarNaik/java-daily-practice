package Polymorphism;

class Calculator{
	void add(char a,int b){
		System.out.println("char , int");
	}
	
	void add(int a,char b){
		System.out.println("int , char");
	}
}

public class Ambigueus {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		/*
		 * Java cannot decide which is better. Result: COMPILATION ERROR (Ambiguous
		 * method call)
		 */
		c.add('A', 'B');
				
	}

}
