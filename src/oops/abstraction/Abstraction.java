package oops.abstraction;

public class Abstraction {
	
	/*
	 *   Data Abstraction:
	 *        Representing the essential features with out showing any 
	 *        background details.
	 *        
	 *        or
	 *            Hide the internal implementation and highlight the set of services 
	 *            that we are offering.
	 *           ex: 
	 *                ATM GUI(Graphical User Interface) screen.
	 *                
	 *   - we can achieve data abstraction by using interfaces and abstract classes.
	 *     
	 *   - "abstract" is a keyword which is used with methods and classes.
	 *   - "abstract" means incomplete, by using abstract keyword we can make a class
	 *      or a method incomplete in nature.
	 *      
	 *   - abstract methods are only for non static not for static
	 *      
	 *   - if we take static methods then they must be complete methods only
	 *     otherwise we get CTE.
	 *      
	 *      ex: 
	 *            abstract class Test{
	 *           
	 *               abstract public void method();
	 *               
	 *               public static void meth() {
		               System.out.println("complete method");
	                 }
	 *            
	 *            }
	 *      
	 *   - If a class contain at least one abstract method then the class must 
	 *     be declared with abstract keyword otherwise we get CTE.
	 *               but 
	 *           An abstract class may or may not contain an abstract method.
	 *           it totally depends on our requirement.
	 *      
	 *      NOTE:
	 *        1.Concrete class:
	 *           fully implemented/complete class.
	 *        2.Non Concrete class:(abstract class)
	 *           partially implemented class.
	 *   
	 *   
	 */

}

