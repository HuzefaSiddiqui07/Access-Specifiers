// Private Access-Specifiers Class 01
// Private Access-Specifiers apply to Global Variable, Method, Constructor & Inner Class only.

package com.accessspecifiers01;

public class Private_01 {
	// private Global Initialization 
	String name;
	int age;
	char gender;
	long contactNumber;
	double weight;
	
	// Create a No Argument Constructor
	public Private_01() {
		name = "Huzefa Siddiqui";
		age = 23;
		gender = 'M';
		contactNumber = 8433786334L;
		weight = 64.0;
		
	}
	private int a = 50;
	private int b = 30;
	// Create a private method 01
	void pvt_add() {
		int addition = a+b;
		System.out.println("Addition is :" + addition);
	  }
	// Create a private method 02
	void pvt_multiply() {
		int multiplication = a*b;
		System.out.println("Multiplication is :" + multiplication);
	 }
	
	// Encapsulation
	// Declare
	private String nickName;
      // Getter
	public String getNickName() {
		return nickName;
	}
	    // Setter
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
  }
