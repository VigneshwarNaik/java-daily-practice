package programming;

class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    void fly() {
        System.out.println("CargoPlane is flying at low height");
    }
}

class PassengerPlane extends Plane {
    void fly() {
        System.out.println("PassengerPlane is flying at medium height");
    }
}

class FighterPlane extends Plane {
    void fly() {
        System.out.println("FighterPlane is flying at great height");
    }
}

class Airport {

	/*
	 * ADVANTAGE 1: Polymorphism Same method can work with different Plane objects
	 */
    void permit(Plane ref) {

		/*
		 * ADVANTAGE 2: Loose coupling Airport does not depend on specific plane type
		 */
        ref.takeOff();

		/*
		 * ADVANTAGE 3: Runtime method binding Correct fly() method is called based on
		 * object type
		 */
        ref.fly();

        ref.land();
    }
}

public class Advantage {

    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport airport = new Airport();

		/*
		 * ADVANTAGE 4: Code reusability Same permit() method is reused for all plane
		 * types
		 */
        airport.permit(cp);
        airport.permit(pp);
        airport.permit(fp);
    }
}
