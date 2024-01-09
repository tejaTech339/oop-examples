package oops;

public class OrderOfExecutionInJava {

	static int staticVar;
	int var;
	
	static {
		System.out.println("static block-1");
		staticVar=10;
	}
	{
		System.out.println("non static block-1");
		var=20;
	}
	{
		System.out.println("non static block-2");
	}
	static {
		System.out.println("static block-2");
	}

	public OrderOfExecutionInJava() {
		System.out.println("constructor");
	}

	public void nonStaticMethod() {
		System.out.println("non static method");
	}

	public static void staticMethod() {
		System.out.println("static method");
		System.out.println("static variable :"+staticVar);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method which is static");
		
		// Methods are executed only if they can be called.
		staticMethod();
		//new OrderOfExecutionInJava();
		new OrderOfExecutionInJava().nonStaticMethod();
				
	}
}
