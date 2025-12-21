package encapsulation;

class Calculator2{
	int a=10;
	int b=20;
	
	int add(){
		int c=a+b;
		return c;
	}
}

public class NoIo {

	public static void main(String[] args) {
		Calculator2 cal=new Calculator2();
		int res=cal.add();
		System.out.println(res);
	}

}
