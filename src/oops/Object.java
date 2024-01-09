package oops;

public class Object {

	public static void main(String[] args) {
		
		Object obj=new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.getClass());
		System.out.println(obj==new Object());
		System.out.println(obj.equals(obj));
	}
}
