package datatype;

public class Formating {
    public static void main(String[] args) {

        float amount = 100.14f;

        // Default precision for %f is 6 decimal places, changed to 4
        System.out.printf("%.4f%n", amount);
    }
}