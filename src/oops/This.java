package oops;

public class This {
	
	/*
	 * final :
	 * -- with variable: no re-intialization
	 * ---with method : no overriding
	 * ---with class : no inheritence
	 * 
	 * private : private class members are accessed only with in the same class.
	 *           if we try to access outside class we will get CTE.
	 *  used only for method and variable and constructor
	 */

	
	public static void main(String[] args) {

		final int a;
		a=15;
		//a=10;
		System.out.println(a);
	}
}
