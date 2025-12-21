
package Inheritance;

//Parent class with some properties and behaviors
class Parents {
 // Properties (attributes)
 float height = 5.8f;
 
 // Behaviors (methods)
 void readbook() {
     System.out.println("I love to read");
 }

}

//Child class inheriting from Parent
class Childs extends Parents {
 // No additional properties or methods for now
}

//Main class to run the program
public class Singleinh {

 public static void main(String[] args) {
     // Creating an object of Child class
     Childs c = new Childs();

     // Accessing inherited properties
     System.out.println(c.height);
             
     // Accessing inherited methods
     c.readbook();
  }
}
