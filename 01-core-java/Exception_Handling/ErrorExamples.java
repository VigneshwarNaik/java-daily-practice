package Exceptions;

public class ErrorExamples {

    public static void main(String[] args) {

        // Compile-time error example:
        // System.out.println("Hello"   // missing bracket(Syntex error)

        // Runtime error: OutOfMemoryError
        // int[] arr = new int[Integer.MAX_VALUE];

        // Runtime error: StackOverflowError
        // disp();
    }

    static void disp() {
        disp();   // infinite recursion
    }

}
