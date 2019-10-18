package com.seenu.SpringProject;

import java.util.Scanner;

import org.springframework.util.NumberUtils;

public class StringBased {

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String firstString = "seenivasan";
	String secondString = "chandrasekaran";
	
	String concatString = firstString + " " + secondString;
	System.out.println(concatString);
	System.out.println("Enter first string");
	String enter1 = sc.next();
	System.out.println("Enter Second string");
	String enter2 = sc.next();
	String enter3 = enter1 + enter2;
	System.out.println(enter3);
	//check odd or even nummbers
}
}
