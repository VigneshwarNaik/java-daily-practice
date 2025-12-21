package Inheritance;

class Parentmu1{
	float height=25.4f;
	
	void readBook(){
		System.out.println("i love to read a book");
	}
}

class Parentmul2{
	float weight=22.5f;
	
	void noSmoke(){
		System.out.println("not good for health ");
	}
}

class Childmul extends Parentmu1,Parentmul2{
	
}

 	Object

public class Multiple {

	public static void main(String[] args) {
		Childmul c=new Childmul();
		System.out.println(c.height);
		c.readBook();
		System.out.println(c.weight);
		c.noSmoke();
		

	}

}
