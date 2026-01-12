package Abstraction;

abstract class Alpha {

    Alpha() {
        System.out.println("Inside Alpha Constructor");
    }
}

class Gemma extends Alpha {

    Gemma() {
        // super();  // called automatically by Java
    }
}

public class Constructor {

    public static void main(String[] args) {

        /*❌ WRONG meaning:
        "in abstract class constructor direct access not possible"*/

		/*
		 * ✔ CORRECT meaning: Constructor cannot be called directly. It is called
		 * automatically when object is created.
		 */

        Gemma g = new Gemma();
    }
}
