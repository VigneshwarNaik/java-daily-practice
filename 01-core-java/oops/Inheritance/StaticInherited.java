package Inheritance;

class Superclass{
	static int a=10;
	
	static void noseStru(){
		System.out.println("nose structure is normal");
	}
}

class Subclass extends Superclass{
	//superclass method is inherited but that method is hidden
//	@Override
	static void noseStru(){//Static method can be inherited  but not be override because its working because of specilized inheritance 
		System.out.println("nose Structure is not normal");
	}
	//if we want to acess  can not acess from subclass can be acess using super class
	
	
	
}


public class StaticInherited {

	public static void main(String[] args) {
		System.out.println(Subclass.a);//Static variable can inherited
		Subclass.noseStru();
	}

}
