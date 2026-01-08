package Polymorphism;

public class Main {

	public static void main(String[] args) {
		System.out.println("1");
		main();
		main(100,200);
		
	}
	public static void main(){
		System.out.println("2");
	}
	
	public static void main(int a,int b){
		System.out.println("3");
	}
	
	public static void main(int a,float b){
		System.out.println("4");
	}

}
