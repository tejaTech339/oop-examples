package oops.inheritence;

class Fu{
	void s() {
		System.out.println("parent s");
	}
	
	void p() {
		System.out.println("parent p");
	}
}
public class Test extends Fu {

	void s() {
		System.out.println("child s");
	}
	
	void j() {
		System.out.println("child j");
	}
	
	public static void main(String[] args) {
		
		Fu fu=new Fu();
		fu.s();
		fu.p();
		System.out.println("==========");
		Test test=new Test();
		test.s();
		test.j();
		test.p();
		System.out.println("==========");
		Fu f=new Test();
		f.s();
		f.p();
		System.out.println("======");
//	    test=(Test) fu;
//		test.s();
//		test.p();
//		test.j();
	}
}
