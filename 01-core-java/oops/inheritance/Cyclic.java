package Inheritance;

class Parentc extends Childc{
	float height=22.4f;
	
	void readBook(){
		System.out.println("I love to read a book");
	}
}

class Childc extends Parentc{
	int weight=66;
	
	void noSmoke{
		System.out.println("not good for health");
	}
}

public class Cyclic {

	public static void main(String[] args) {
		
//		Error is Cylic detected

	}

}
