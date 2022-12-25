// Main Class Of Default_01

package com.accessspecifiers01;

import java.util.Scanner;

import com.accessspecifiers01.Default_01;

public class Default_Main01 {
	// Create a Static Method
				public static void  math_table (int fn) {
			         int s = 1;
					// Do-While-Loop
					do {
						System.out.println(fn+ "*" +s+ "=" +fn*s);
						s++;
					} while (s<=10);
				}


	public static void main(String[] args) {
		
		// Create an Scanner Object to give Or store some input from user
				Scanner sc = new Scanner(System.in);
				
			System.out.println("Enter First Value");
			int box1 = sc.nextInt();
			
			System.out.println("Enter Second Value");
			int box2 = sc.nextInt();
			
			System.out.println("Store Fisrt Value in :" + box1);
			System.out.println("Store Fisrt Value in :" + box2);
			
			     // Create an Object to call the All Methods
			       Default_01 myobj = new Default_01();
			      
			     int result1 = myobj.addNumbers(box1, box2);
			     int result2 = myobj.subtractNumbers(box1, box2);
			     int result3 = myobj.multiplyNumbers(box1, box2);
			     
			     System.out.println("Addition Is :" + result1);
			     System.out.println("subtraction Is :" + result2);
			     System.out.println("multiplication Is :" + result3);
			     
			     // Create an Scanner Object
		    	  Scanner maths = new Scanner(System.in);
		    	  
		   // Create Print formula for user to put some input for Math_Table
		    	  System.out.println("Enter a table 01 Value");
		    	  int content1 = maths.nextInt();
		    	  
		    	  System.out.println("Enter a table 02 Value");
		    	  int content2 = maths.nextInt();
		    	  
		    	  System.out.println("Store table 01 Value in :" + content1);
		    	  System.out.println("Store table 02 Value in :" + content2);
		    	  System.out.println();
		    	  
		    	  math_table(content1);
		    	  System.out.println();
		    	  math_table(content2);
		

	}

}
