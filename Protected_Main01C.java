// Main Class of Protected_C01

package com.acessspecifiers02;

//Import a another package of different to create object to call all values in pass by object args to print on console
import com.accessspecifiers01.Protected_C01;


public class Protected_Main01C  {

	public static void main(String[] args) {
		
	// Create an  Constructor Object to Call Parent Class Constructor As Well 
		
		Protected_C01 child = new Protected_C01("Huzefa Siddiqui", 23, 'M', 8433786334L, 64.0);
		// Call Method By Object
		child.addNumber();
		child.subtractNumber();
		
	}

}
