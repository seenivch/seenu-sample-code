package com.seenu.SpringProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.util.StringUtils;
/**
 * CalculatorImpl simple calculation
 * @author seenu
 *
 */

public class CalculatorImpl {
	public static BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
	public static void main(String [] args) throws IOException {
		System.out.println("Enter first value : ");
		String firstValue = reader.readLine();
		boolean firstValueIsNumeric = firstValue.chars().allMatch(Character::isDigit);
		if (firstValueIsNumeric) {
			firstValueMethod(firstValue,firstValueIsNumeric);
		} else {
			System.out.println("Enter valid number");
			main(null);
		}
	}

	private static void firstValueMethod(String firstValue , boolean firstValueIsNumeric) throws IOException {
		if(StringUtils.isEmpty(firstValue)) {
			System.out.println("Please Enter first value");
			main(null);
		}  else {
			secondValueMethod(firstValue,firstValueIsNumeric);
		}
		
	}

	private static void secondValueMethod(String firstValue , boolean firstValueIsNumeric) throws IOException {
		System.out.println("Enter second value : ");
		String secondValue = reader.readLine();
		boolean secondValueIsNumeric = secondValue.chars().allMatch(Character::isDigit);
		if (secondValue.isEmpty()) {
			System.out.println("Please Enter second value");
			secondValueMethod(firstValue,firstValueIsNumeric);
		} else if (!secondValueIsNumeric) {
			System.out.println("Enter Valid Number");	
			secondValueMethod(firstValue,firstValueIsNumeric);
		}
		if(firstValueIsNumeric && secondValueIsNumeric) {
			int firstResult = Integer.parseInt(firstValue);
			int secondResult = Integer.parseInt(secondValue);
			float firstResultFloat = Float.parseFloat(firstValue);
			float secondResultFloat = Float.parseFloat(secondValue);
			int addition =  firstResult + secondResult;
			int subtraction =  firstResult - secondResult;
			int multiplication =  firstResult * secondResult;
			float division =  firstResultFloat / secondResultFloat;
			System.out.println("addition :" + addition);
			System.out.println("subtraction :" + subtraction);
			System.out.println("multiplication :" + multiplication);
			System.out.println("division :" + division);
		}
		
	}
}