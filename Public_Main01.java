package com.accessspecifiers01;

import java.util.*;

public class Public_Main01 {

	public static void main(String[] args) {
		// Create an Object to call No arguments methods
		Public_01 obj = new Public_01();
		// Calling All Method by Object
		   obj.addNumber();
		   obj.subtractNumber();
		   
		// Create an Scanner Object to give Or store some input from user
			Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter First Value");
		int box1 = sc.nextInt();
		
		System.out.println("Enter Second Value");
		int box2 = sc.nextInt();
		
		System.out.println("Store Fisrt Value in :" + box1);
		System.out.println("Store Fisrt Value in :" + box2);
		
		     // Create an Object to call the All Methods With Arguments
		         Public_01 myobj = new Public_01();
		      
		     int result1 = myobj.addNumbers(box1, box2);
		     int result2 = myobj.subtractNumbers(box1, box2);
		     int result3 = myobj.multiplyNumbers(box1, box2);
		     
		     System.out.println("Addition Is :" + result1);
		     System.out.println("subtraction Is :" + result2);
		     System.out.println("multiplication Is :" + result3);
	}

}
