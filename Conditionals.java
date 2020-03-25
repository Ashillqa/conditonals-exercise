package com.qa.main;

public class Conditionals {
	

	
	public int Decider(int num1, int num2, Boolean outcome) {
		
		
		if (num1 % 2 == 0 || num2 % 2 == 0) {
			
			return 0;
			
		} else if (outcome) {
			
			return num1 + num2;
			
		} else {
			
			return num1 * num2;
		}
	}

}
