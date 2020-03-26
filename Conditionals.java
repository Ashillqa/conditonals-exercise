package com.qa.main;

public class Conditionals {
	

	
	public void Decider(int num1) {
		
		
		if (num1 > 2000 && num1 <= 6000 && num1 <= 4000) {
			
			System.out.println("A \nB \nE");
		} else if (num1 > 6000) {
			
			System.out.println("A \nC");
		} else if (num1>4000) {
			System.out.println("A \nB \nD");
		} else if (num1 <= 2000 && num1 > 100 && num1 >600) {
			System.out.println("1 \n3 \n5");
		} else if (num1 > 100 && num1 <= 500) {
			System.out.println("1 \n3 \n4 \n7");
		}else if (num1 > 500) {
			System.out.println("1 \n3 \n4 \n6");
		} else {
			System.out.println("1 \n2");
		}
			
			
}
	
	public void diffMeth(int n1) {
		
		if (n1 >= 0) {
			
			if (n1 > 2000 && n1 <= 4000)
				System.out.println("A \nB \nE");
			
			if (n1 <= 6000 && n1 > 4000)
				System.out.println("A \nB \nD");
			
			if (n1 > 6000)
				System.out.println("A \nC");
			
			if (n1 > 100 && n1 <= 500)
				System.out.println("1 \n3 \n4 \n7");
			if (n1 > 500 && n1 <= 600)
				System.out.println("1 \n3 \n4 \n6");
			if (n1 > 600 && n1 <=2000)
				System.out.println("1 \n3 \n5");
			
		} else {
			System.out.println("1 \n2");
		}
	}
	
}
