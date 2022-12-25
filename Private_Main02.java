// Main Class Of Private_02 Class

package com.accessspecifiers01;

public class Private_Main02 {

	public static void main(String[] args) {
		
        System.out.println(" Create a Constructor Parameterize Object 01 for 1st person :-----------");
		Private_02 pvt05 = new Private_02("Huzefa Siddiqui", 23, 'M', 8433786334L, 64.0);
		 System.out.println(" Create a Constructor Object 02 for 2nd person :-----------");
		Private_02 pvt06 = new Private_02("Avesh Shaikh", 23, 'M', 8433817771L, 67.0);
		
		     // Initialization 
				int no1 = 45;
				int no2 = 35;
				String name = "Huzefa Muzammil Siddiqui";
				
				
				 System.out.println("Create an Constructor Parameterize Object to Call all Methods:-----------");
				Private_02 pvt01 = new Private_02(no1+no2, no1-no2, no1*no2,"Huzefa Muzammil Siddiqui");
				int result1 = pvt01.addition(no1, no2);
				int result2 = pvt01.subtraction(no1, no2);
				int result3 = pvt01.multiplication(no1, no2);
				String result4 = pvt01.fullName(name);
		
	             System.out.println("Addition :" + result1);
	             System.out.println("Subtraction :" + result2);
	             System.out.println("Multiplication :" + result3);
	             System.out.println("Full Name :" + result4);
				
			}
	   }
