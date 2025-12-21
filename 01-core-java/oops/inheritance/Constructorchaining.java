package Inheritance;

class Vigneshwar{
	int num1;
	int num2;
	
	public Vigneshwar(){
		 num1=200;	
		 num2=100;
	}
	
	public Vigneshwar(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
}

class Vasanth extends Vigneshwar{
	
	int num3;
	int num4;
	
	
	public Vasanth(){
		this(9,99);
		num3=400;
		num4=300;
	}
	public Vasanth(int num3,int num4){
		super();
		this.num3=num3;
		this.num4=num4;	
	}
	
	void disp(){
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}




public class Constructorchaining {

	public static void main(String[] args) {
		Vasanth naik=new Vasanth();
		naik.disp();
		
	}

}
