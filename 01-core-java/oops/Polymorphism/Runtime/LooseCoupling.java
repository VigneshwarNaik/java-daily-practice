        /*
         * LOOSely COUPLED CODE
         * --------------------
         * We use parent class reference (Plane ref)
         * but store child class objects in it.
         * 
         * This means:
         * Code depends on the parent class (Plane)
         * NOT directly on child classes.
         * 
         */


package Polymorphism;

class Plane{
    
    // Method that will be overridden
    void fly(){
        System.out.println("Plane is flying");
    }
}

// Child class 1
class CargoPlane extends Plane{
    @Override
    void fly(){
        System.out.println("CargoPlane is flying at low height");
    }
}

// Child class 2
class PassengerPlane extends Plane{
    @Override
    void fly(){
        System.out.println("PassengerPlane is flying at medium height");
    }
}

// Child class 3
class FighterPlane extends Plane{
    @Override
    void fly(){
        System.out.println("FighterPlane is flying at great height");
    }
}

public class LooseCoupling {

    public static void main(String[] args) {
        
        // Creating individual objects
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();


        Plane ref;   // Parent reference variable

        ref = cp;    // pointing to CargoPlane object
        ref.fly();   // Calls CargoPlane fly()

        ref = pp;    // pointing to PassengerPlane object
        ref.fly();   // Calls PassengerPlane fly()

        ref = fp;    // pointing to FighterPlane object
        ref.fly();   // Calls FighterPlane fly()

    }
}
