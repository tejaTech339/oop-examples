package oops;

class Stu{
	
	Stu(){
		System.out.println("Stu class constr");
	}
}
class Cust{
	
	Cust(){
		System.out.println("Cust class constr");
	}
}
public class ClassClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Class c=Class.forName("Stu");
	
		Stu st=(Stu) c.newInstance();
		System.out.println("Object is created :"+st.getClass().getName());
		
		
		
		
		
		
		/*
		 *  class: 
		 *        - a class is a blue print or template of an Object.
		 *        - it is a logical representation of an object.
		 *  
		 *  Object:
		 *        - an Object is an instance of a class.
		 *        - it is a physical representation.
		 *        - it talks about properties and behaviors.
		 *           (here we are talking about the functionality)
		 *        - which exist in the real world(anything that exists in the world
		 *           and can be differentiate from others) .
		 *           ex:
		 *              table,car,dog,person. all are comes under Object.
		 *           
		 *   NOTE:
		 *         We have only one class by using that class we can create 
		 *         n-no.of Objects.
		 *         
		 *   * So the entire OOPLanguage methodology has been derived from the 
		 *     concept called OBJECT.
		 *     
		 *   OOP Principles:
		 *    1.Inheritance
		 *    2.Polymorphism
		 *    3.Encapsulation
		 *    4.Abstraction.
		 *   
		 */
		
	}
}