abstract class Vehicle {

	/*
	 * A variable ONLY stores a value It does NOT do any action So
	 * abstraction is NOT used here
	 */
   abstract int speed = 60;   //❌ ERROR


	/*
	 * A method DOES work (action) We hide HOW it works Child class will implement
	 * it
	 */
    abstract void drive();   // ✔ abstraction is allowed
}


class Car extends Vehicle {

    void drive() {
        System.out.println("Car is moving");
    }
}


public class Variable {
    public static void main(String[] args) {

        Vehicle v = new Car();

        v.drive();

    }
}
