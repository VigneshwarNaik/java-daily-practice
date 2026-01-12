package Abstraction;

abstract class Test {

	/*
	 * ❌ ERROR: abstract → method must be overridden final → method cannot be
	 * overridden Both together are CONTRADICTORY
	 */
 abstract final void show();
}


public class Final {

	public static void main(String[] args) {
		/*
		 * No code needed here Compile-time error occurs above
		 */
	}

}
