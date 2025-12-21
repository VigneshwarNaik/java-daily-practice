package Inheritance;


class GrandparentH{
	float Hieght=34.3f;
	
	void readBook(){
		System.out.println("I love to read a book");
	}
}

class ParentH extends GrandparentH{
	
}

class ChildH1 extends ParentH{
	
}


class ChildH2 extends ParentH{
	
}
public class Hierachical {

	public static void main(String[] args) {
		
		ChildH1 c1=new ChildH1();
		System.out.println(c1.Hieght);
		c1.readBook();
		
		ChildH2 c2=new ChildH2();
		System.out.println(c2.Hieght);
		c2.readBook();
		
		
		
		

	}

}
