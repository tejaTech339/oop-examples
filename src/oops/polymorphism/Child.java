package oops.polymorphism;

class Parent{
	
	public void property() {
		// this is a overridden method.
		System.out.println("i will give cash+land+gold to my child");
	}
	
	public static void meth() {
		System.out.println("parent static");
	}
}
public class Child extends Parent {

	public void property() {
		// this is a overriding method.
		System.out.println("i only want a bike papa");
	}
	
	public static void meth() {
		System.out.println("child static");
	}
	
	public static void main(String[] args) {
		
		Parent p=new Parent();
		//p.property();//i will give cash+land+gold to my child
		//p.meth();
		
		Child ch=new Child();
		//ch.property();//i only want a bike papa
		//ch.meth();
		
		Parent p1=new Child();// Up-Casting
		//p1.property();//i only want a bike papa
		//p1.meth();//parent static
		/*
		 *  NOTE:
		 *      -  in M.Overriding  method resolution is always takes care by JVM based on
		 *         Runtime Object and executes the method.
		 *      
		 *   ex:
		 *   Parent p1=new Child();
		 *     
		 *        here new Child(); is the runtime Object.
		 *        
		 *   -  In Method Hiding method resolution always takes care by compiler
		 *         based on reference type.
		 *       ex: 
		 *            Parent p1=new Child();
		 *           here  p1 is the reference type.
		 */
		
		//Child ch1=(Child) new Parent();// Down-casting.
		//ch1.property();//java.lang.ClassCastException
		//Parent cannot be cast to class Child 
	}
}
