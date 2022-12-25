// Child Class Of Protected_P01 Parents Class

package com.accessspecifiers01;

public class Protected_C01 extends Protected_P01 {
	
	
	public Protected_C01(String userName, int userAge, char userGender, long userContactNumber, double userWeight) {
		super(userName, userAge, userGender, userContactNumber, userWeight);
		
	}
	// Initialization Global Variable With Static
	   protected static int ui = 55;
	   protected static int ru = 45;
	   
	// Create a 2 Methods with no arguments
		public static void addNumber() {
			int add = ru+ui;
			System.out.println("Add :" + add);
		}
		public static void subtractNumber() {
			int subtract = ui-ru;
			System.out.println("Subtract :" + subtract);
		}

}
