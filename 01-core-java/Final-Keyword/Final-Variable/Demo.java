package programming;

class Test {
    // 'final' variable means its value CANNOT be changed
    final int a = 100;
}

public class Demo {

    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t.a);

        /*❌ ERROR HERE:
        Cannot assign a new value to 'a'
        Because 'a' is declared as final
        final variables are CONSTANTS*/
        
        
        t.a = 200;   // Compile-time error

        System.out.println(t.a);
    }
}
