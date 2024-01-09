package oops.inheritence;

public class Inheritance {

	/*
	 *  Inheritance:
	 *        Sharing/Acquiring the copy of properties from parent/base/super class to 
	 *        sub/child/derived class.
	 *        
	 *     Types:
	 *     
	 *     1.single level inh
	 *     2.multilevel inh
	 *     3.Hirarichle inh
	 *     4.multiple inhi
	 *     5.Hybrid inh (According to ORACLE There is no such concept called Hybrid Inh).
	 * 
	 *   Single-level:
	 *     ex: 1-super class
	 *         1-sub class
	 *         
	 *      -->   class Super{
	 *         
	 *            }
	 *            class Child extends Super{
	 *         
	 *            }
	 *            
	 *    Multilevel:
	 *     ex:
	 *           class Super{
	 *           
	 *           }
	 *           class Child extends Super{
	 *           
	 *           }
	 *           class GrandChild extends Child{
	 *           
	 *           }....
	 *           
	 *    Hirarichel:
	 *       ex: 1-super class
	 *           N.no of sub classes.
	 *           
	 *           class Parent{
	 *           
	 *           }
	 *           class Child1 extends Parent{
	 *           
	 *           }
	 *           class Child2 extends Parent{
	 *           
	 *           }
	 *           class Child3 extends Parent{
	 *           
	 *           }....
	 *           class Child_N extends Parent{
	 *           
	 *           }
	 *           
	 *    Multiple Inhe:
	 *           
	 *           Multiple Parents
	 *           single child
	 *           
	 *            Not possible using classes if we try to extend multiple classes
	 *            we get AMBIGUITY problem generated by Compiler(Diamond Ambiguity).
	 *            
	 *    NOTE: We can achieve multiple inheritance by using interfaces.
	 *            
	 *            class Parent1{
	 *                p v m(){
	 *                }
	 *            }
	 *            class Parent2{
	 *                p v m(){
	 *                }
	 *            }
	 *            class Child extends Parent1,Parent2{
	 *                //Here confusion arises for compiler which functionality 
	 *                   has to be extended.
	 *            }
	 */
}
