public class Variables {

    int age = 23;                 // Instance variable
    static String college = "JSS"; // Static variable

    public static void main(String[] args) {

        int marks = 85;           // Local variable

        Variables v = new Variables();

        System.out.println("Age: " + v.age);
        System.out.println("College: " + college);
        System.out.println("Marks: " + marks);
    }
}
