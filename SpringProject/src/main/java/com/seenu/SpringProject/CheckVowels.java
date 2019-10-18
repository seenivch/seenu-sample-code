package com.seenu.SpringProject;

import java.util.Scanner;

public class CheckVowels {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter String :");
    	String enteredString = sc.next();
        int vcount = 0, ccount = 0;
        String lowerString = enteredString.toLowerCase();
        for(int i = 0; i < lowerString.length(); i++) {
        	char ch = lowerString.charAt(i);
        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
        		vcount++;
        	} else if((ch >= 'a'&& ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);
    }
}