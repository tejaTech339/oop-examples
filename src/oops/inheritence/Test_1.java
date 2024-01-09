package oops.inheritence;

class Parent {

	void method() {
		System.out.println("parent method");
	}
}

class Child extends Parent {

	void method() {
		System.out.println("child method");

	}
}

public class Test_1 {

	public static void main(String[] args) {

//		Parent p = new Parent();
//		p.method();

//		Child ch=new Child();
//		ch.method();

//      Parent p=new Child();// up-casting/widening
//	    p.method();

//		Child ch = (Child) new Parent();// down-casting/narrowing
//		ch.method(); // -> java.lang.ClassCastException
	}
}
