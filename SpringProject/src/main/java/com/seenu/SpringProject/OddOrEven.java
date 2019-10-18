package com.seenu.SpringProject;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first int to check odd or even");
		String firstInt = sc.next();
		boolean boo= firstInt.matches("-?\\d+(.\\d+)?");
		int testInt = 0;
		if(boo) {
			testInt = Integer.parseInt(firstInt);
			if(testInt % 2 == 0) {
				System.out.println(firstInt + ": is Even number" );
			} else   {
				System.out.println(firstInt + ": is Odd number" );
			}
		} else {
			enterValidNumber();
		}
	}

	private static void enterValidNumber() {
	 System.out.println("Enter valid number");
	 main(null);
	}
}
