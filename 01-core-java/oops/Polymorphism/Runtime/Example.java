package Polymorphism;

class Plane {
	void fly(){
		System.out.println("Plane is flying");
	}
	
	void carryCargo(){
		System.out.println("Cargoplane is carrying cargo");
	}

}

class Cargoplane extends Plane{
	@Override
	void fly(){
		System.out.println("Cargoplane is flying in low height");
	}
	
	void carryCargo(){
		System.out.println("Cargoplane is carrying cargo");
	}
}

class Passengerplane extends Plane{
	@Override
	void fly(){
		System.out.println("Passengerplane is flying in medium height");
	}
	
	void carryPassenger(){
		System.out.println("PassengerPlane is carrying paseneger");
	}	
}

class Fighterplane extends Plane{
	@Override
	void fly(){
		System.out.println("Fighterplane is flying in great height");
	}
	
	void carryWeapons(){
		System.out.println("Fighterplane is carrying weapons");
	}
}

public class Example {

	public static void main(String[] args) {
		Plane ref;
		
		Cargoplane cp=new Cargoplane();
		Passengerplane pp=new Passengerplane();
		Fighterplane fp=new Fighterplane();
		
		ref=cp;
		ref.fly();
		((Cargoplane)ref).carryCargo();
		
		ref=pp;
		ref.fly();
		((Passengerplane)ref).carryPassenger();
		
		ref=fp;
		ref.fly();
		((Fighterplane)ref).carryWeapons();
		
	

	}

}
