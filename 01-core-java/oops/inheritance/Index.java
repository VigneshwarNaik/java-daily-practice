// Package declaration
package Inheritance;

// Parent class with some properties and behaviors
class Parent {
    // Properties (attributes)
    float height = 5.8f;
    String color = "brown";
    String noseStructure = "normal";

    // Behaviors (methods)
    void readbook() {
        System.out.println("I love to read");
    }

    void noDrink() {
        System.out.println("I don't drink alcohol");
    }

    void noSmoke() {
        System.out.println("I don't smoke");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    // No additional properties or methods for now
}

// Main class to run the program
public class Index {

    public static void main(String[] args) {
        // Creating an object of Child class
        Child c = new Child();

        // Accessing inherited properties
        System.out.println(c.height);
        System.out.println(c.color);
        System.out.println(c.noseStructure);

        // Accessing inherited methods
        c.readbook();
        c.noDrink();
        c.noSmoke();
    }
}
