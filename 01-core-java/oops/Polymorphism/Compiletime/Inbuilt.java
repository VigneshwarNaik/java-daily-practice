package Polymorphism;

public class Inbuilt {

    public static void main(String[] args) {

        String s = "RajaRamMohanRoy";

        /*
         * Method Overloading Example (Inbuilt Method):
         *
         * substring() is an inbuilt method of String class
         * It is overloaded with different parameter lists
         */

        // substring(int beginIndex)
        System.out.println(s.substring(7));

        // substring(int beginIndex, int endIndex)
        System.out.println(s.substring(7, 12));
    }
}
