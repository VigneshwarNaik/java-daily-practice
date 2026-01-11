class Test1 {
    final void fun() {
        System.out.println("Inside parent class method");
    }
}

class Test2 extends Test1 {

	/*
	 * ❌ ERROR: Cannot override the final method 'fun()' from Test1 Because final
	 * methods cannot be overridden by child classes
	 */    
	@Override
    void fun() {
        System.out.println("Inside child class overridden method");
    }
}

public class Demo {

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.fun();
    }
}
