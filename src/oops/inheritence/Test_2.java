package oops.inheritence;

class Parent_II{
	
	public Parent_II() {

		System.out.println("parent constr");
	}
	
	public static void m1() {
		System.out.println("parent m1");
	}
}
class Child_II extends Parent_II{
	
	public Child_II() {

		System.out.println("child constr");
	}
	
	public static void m1() {
		System.out.println("child m1");
	}
}
public class Test_2 {

	public static void main(String[] args) {
		
		//Child_II ch=new Child_II();
		//ch.m1();
		
		Parent_II p=new Child_II();
		p.m1();
	}
}
