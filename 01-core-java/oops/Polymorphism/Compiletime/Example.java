package methodoverloading;

class Calculator{
	void add(){
		System.out.println(100+50);
	}
	
	void add(int a,int b){
		System.out.println(a+b);
	}
	
	void add(double a,int b){
		System.out.println(a+b);
	}
	
	void add(float a,double b){
		System.out.println(a+b);
	}
}


public class Example {
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(10.5f,54.444);
	}

}
