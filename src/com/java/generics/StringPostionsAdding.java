package com.java.generics;

import java.util.Scanner;

public class StringPostionsAdding {
	
	public static void main(String[] args) {
		StringPostionsFunction sf= new StringPostionsFunction();
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" enter the String");
		 String inputString =sc.nextLine();
		 System.out.println("enter the vowels condtion 1 for adding and 2 ingoring");
		 int vowels = sc.nextInt();
		 switch (vowels) {
		 case 1:
			 sf.includevowels(inputString);
			 break;
		 case 2:
			 sf.avoidvowels(inputString);
		 break;
		 default:
			 System.out.println(" enteer the right choice");
		 }
		 
		 
		;
	}
}
