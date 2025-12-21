package Inheritance;

class Grandparent{
	float height=12.4f;
	
	void readBook(){
		System.out.println("I love to read a book ");
	}
}

class ParentM extends Grandparent{
	
}

class ChildM extends ParentM{
	
}

public class Multilevel {

	public static void main(String[] args) {
		ChildM c=new ChildM();
		System.out.println(c.height);
		c.readBook();

	}

}
