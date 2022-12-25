// Public Access Specifiers

package com.accessspecifiers01;

public class Public_02 {
	
	// Global Variable with Static
	static String name;
	static int s;
	static int d;
	static int multiply;
	static int add;
	 
	// Create Parameterized Constructor
	public Public_02 (String myName, int multiplication, int addition) {
		s = 60;
		d = 40;
		name = myName;
		multiply = multiplication;
		add = addition;
		
		System.out.println("My Name :" + name);
		System.out.println("Multiplication :" + multiply);
		System.out.println("Addition :" + add);
	}
	
       public static void main(String[] args) {
		
		// Create an Constructor object
		Public_02 obj = new Public_02("Huzefa Siddiqui", 60*40, 60+40);
	}
  }

