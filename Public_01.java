// Public Access Specifiers
// It apply to Class, Method, Constructor, Global Variable, Static variable, Inner Class, Outer Class

package com.accessspecifiers01;

public class Public_01 {
	// Initialization Global Variable With Static 
	static int cv = 85;
	static int vc = 60;
	static int dc = 55;
	static int pd = 40;
	
	// Create a 2 Methods with no arguments
	public static void addNumber() {
		int add = vc+pd;
		System.out.println("Add :" + add);
	}
	public static void subtractNumber() {
		int subtract = cv-dc;
		System.out.println("Subtract :" + subtract);
	}
	// Create a Method 1 with arguments
		public int addNumbers (int sf , int dm) {
			int addition = sf+dm;
			return addition;
		}
		// Create a Method 2 with arguments
		public int subtractNumbers (int fs , int jk) {
			int subtraction = fs-jk;
			return subtraction;
		}
		// Create a Method 3 with arguments
			public int multiplyNumbers (int fg , int sd) {
				int multiplication = fg*sd;
				return multiplication;
			}
	

}
