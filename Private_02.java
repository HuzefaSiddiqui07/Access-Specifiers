// Private Access-Specifiers Class 01
// Private Access-Specifiers apply to Global Variable, Method, Constructor & Inner Class only.

package com.accessspecifiers01;

public class Private_02 {
	
	// Global Initialization 
		private String name;
		private int age;
		private char gender;
		private long contactNumber;
		private double weight;
		
		// Create a Parameterize Constructor 01 
		public Private_02 (String userName, int userAge, char userGender, long userContactNumber, double userWeight) {
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
		
		// Create a Parameterize Constructor 02
		public Private_02(int add, int subtract, int multiply, String name) {
			
		}

		// Create a private method 01 with arguments
		int addition (int j, int s) {
			int addition = j+s;
			return addition;
		}
		
		 // Create a private method 02 with arguments
		int subtraction (int p, int e) {
			int subtraction = p-e;
			return subtraction;
		}
		
		// Create a private method 03 with arguments
		int multiplication (int t, int w) {
					int multiplication = t*w;
					return multiplication;
				}
	      // Create a private method 04 with arguments
		String fullName(String name) {
					return name;
				}
		}
       
