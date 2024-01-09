package oops.polymorphism;

public class Polymorphism{

	/*
	 *  Polymorphism:
	 *    
	 *    poly- means many
	 *    morphs - means forms
	 *    
	 *   - The ability of an object exists in different stages.
	 *   - And it occurs when we have many classes that are related to each other
	 *     by "inheritance".
	 *     
	 *  - There are 2types of Polymorphism
	 *    1.Compile time 
	 *    2.Runtime
	 *    
	 *    Compile time:
	 *        - Also know as Method Overloading.
	 *        - Method Overloading:
	 *            Same method name with different parameters.
	 *            (method overloading definition and examples).
	 *            
	 *            
	 *    Runtime Pol:
	 *        - Also known as Method Overriding.
	 *        - Method Overriding:
	 *              The process of redefining parent/base/super class method in the 
	 *              sub/derived/child class
	 *              as per the requirement of sub 	class is called method overriding.
	 *      
	 *       NOTE: Method overriding is only for non-static methods.
	 *             If it is static method then it is Method Hiding.
	 *             
	 *       NOTE: best example for overridden method is "toString()" method.
	 *        
	 *        where toString() is available in java.lang.Object class.
	 *          
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		System.out.println("hello".toString());
	}
}
