package Abstraction;

abstract class Plane{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class CargoPlane extends Plane {
	@Override
	void takeOff() {
		System.out.println("CargoPlane is taking off");
	}
	
	@Override 
	void fly(){
		System.out.println("Cargo plane is flying ");
	}
	
	@Override
	void land(){
		System.out.println("Cargo plane is landing");
	}
}

class PassengerPlane extends Plane{
	@Override
	void takeOff(){
		System.out.println("Passeneger plane is taking off");
	}
	
	@Override
	void fly(){
		System.out.println("passenger plane is flying");
	}
	
	@Override
	void land(){
		System.out.println("Passenger plane is landing");
	}
}

class FighterPlane extends Plane{
	
	@Override
	void takeOff(){
		System.out.println("Fighter plane is taking off");
	}
	
	@Override
	void fly(){
		System.out.println("Fighter plane is flying");
	}
	
	@Override
	void land(){
		System.out.println("Fighter plane is landing");
	}
}


class Airport{
	public static void permit(Plane ref){
	ref.takeOff();	
	ref.fly();
	ref.land();
	}
}

public class Example {
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		Airport.permit(cp);
		Airport.permit(pp);
		Airport.permit(pp);
	}
}
