package Abstraction;

/*❌ ERROR:
Cannot extend the final class Test1
A final class cannot be inherited by any other class*/

final class Test1 {
    public void fun() {
        System.out.println("Inside parent class method");
    }
}

class Test2 extends Test1 {
	@Override
    public void fun() {
        System.out.println("Inside child class overridden method");
    }
}

public class Demo {

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.fun();
    }
}
