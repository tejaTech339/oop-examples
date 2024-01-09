package oops.inheritence;

// Multi Level inheritence

class P{
	void m1() {
		System.out.println("p-m1");
	}
}
class C extends P{
	void m1() {
		System.out.println("c-m1");
	}
}
class D extends C{
	void m1() {
		System.out.println("d-m1");
	}
}
public class MultiLevelInher {

	public static void main(String[] args) {
		
		D d=new D();
		d.m1();
	}
}
