// Main Class Of Private_01 Class

package com.accessspecifiers01;

public class Private_Main01 {

	public static void main(String[] args) {
		
		// Create an Object to Call method
		Private_01 pvt01 = new Private_01();
System.out.println("Print Addition & Multiplication Values Print On Console By Method :--------------------");
              pvt01.pvt_add();
              pvt01.pvt_multiply();
		
		
System.out.println("Print All Information Print On Console By Constructor Object :--------------------");
        
           //Create an Constructor Object
		Private_01 pvt02 = new Private_01();
		
		System.out.println("Name :" + pvt02.name);
		System.out.println("Age :" + pvt02.age);
		System.out.println("Gender :" + pvt02.gender);
		System.out.println("Contact Number :" + pvt02.contactNumber);
		System.out.println("Weight :" + pvt02.weight);
		
		System.out.println("Print Nickname By Using Encapsulation :------------");
		Private_01 name = new Private_01();
		name.setNickName("Hujju");
		System.out.println("Nickname :" + name.getNickName());
	}

}
