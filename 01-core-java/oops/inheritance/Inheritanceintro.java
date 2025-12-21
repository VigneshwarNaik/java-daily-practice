package Inheritance;

class Parent1{
	float height=5.8f;
	String color="Brown";
	String noseStructure="normal";
	
	void readBook(){
		System.out.println("I love to read a Book");
	}
	
	void noDrink(){
		System.out.println("I don't Drink alocohal");
	}
	
	void noSmoke(){
		System.out.println("I don't smoke");
	}
}

class Child1 extends Parent1{
	
}

public class Inheritanceintro {

	public static void main(String[] args) {
		Child1 child=new Child1();
		System.out.println(child.height);
		System.out.println(child.color);
		System.out.println(child.noseStructure);
		child.readBook();
		child.noDrink();
		child.noSmoke();

	}

}
