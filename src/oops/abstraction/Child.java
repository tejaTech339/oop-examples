package oops.abstraction;

 abstract class Parent {

	 abstract public void method(); 
	 
	 public static void meth() {
		 System.out.println("complete method");
	 }
	
}

public class Child extends Parent{

	@Override
	public void method() {
		System.out.println("overriding method");
	}
	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.method();
		ch.meth();
	}
}
