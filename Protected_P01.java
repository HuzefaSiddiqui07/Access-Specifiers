// Protected Access Specifiers
// Parent Class Of Protected_C01 Child Class
package com.accessspecifiers01;

public class Protected_P01 {
	
	// Global Initialization 
			protected String name;
			protected int age;
			protected char gender;
			protected long contactNumber;
			protected double weight;
			
	// Create a Parameterize Constructor 01 
	   public Protected_P01 (String userName, int userAge, char userGender, long userContactNumber, double userWeight) {
			name = userName;
			age = userAge;
			gender = userGender;
			contactNumber = userContactNumber;
			weight = userWeight;
				
			System.out.println("Name :" + name);
			System.out.println("Age :" + age);
			System.out.println("Gender :" + gender);
			System.out.println("Contact Number :" + contactNumber);
			System.out.println("Weight :" + weight);
				
			}
	  

}
