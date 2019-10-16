package com.seenu.SpringProject;

import java.util.Arrays;

/**
 * SumOfArray string to char and char to string
 * @author seenu
 *
 */

public class SumOfArray {

	public static void main(String[] args) {
		int arrayOfInt[] = {1,2,2,3,4,5};
		int addedValue=0;
		for (int i=0 ; i<arrayOfInt.length ; i++) {
			addedValue = addedValue + arrayOfInt[i];
		}
		float avgOfAddedValue = addedValue/arrayOfInt.length;
		System.out.println("sum of array :" + addedValue);
		System.out.println("Avg is :" + avgOfAddedValue );

		char [] nameChar = {'s','e','e','n','u'};
		char [] tempA = {};
		for (char value : nameChar) {
			System.out.println(value);
		}
		tempA = nameChar.clone();
		Arrays.sort(tempA);
		System.out.println("Sorted Value is :");
		for(char tempB : tempA) {
			System.out.println(tempB);
		}
		String finalString = new String(tempA);
		System.out.println("The value of String is :" + finalString);
		
		String sampleString = "seenucode";
		char [] testChar = sampleString.toCharArray();
		char [] testArrB = {};
		for(char testArrA : testChar) {
			System.out.println(testArrA);
		}
		testArrB = testChar.clone();
		String finalString1 = new String(testArrB);
		System.out.println(finalString1);
	}
}
