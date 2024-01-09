package oops.encapsulation;

public class TestDemo {

public static void main(String[] args) {
		
		Demo d=new Demo();
		
		d.setId(1);
		d.setName("Nikenduku");
		d.setEmail("porapulka@gmail.com");
		d.setMobileNo(9876543210L);
		d.setPassword("cheptharu...mari");
		
		System.out.println("Id is :"+d.getId());
		System.out.println("Name is :"+d.getName());
		System.out.println("Email is :"+d.getEmail());
		System.out.println("Mobile is :"+d.getMobileNo());
		System.out.println("Password is :"+d.getPassword());
		
		/*
		 * output:
		 * 
		 *       Id is :1
				 Name is :Nikenduku
				 Email is :porapulka@gmail.com
				 Mobile is :9876543210
				 Password is :cheptharu...mari
		 */
	}

}
