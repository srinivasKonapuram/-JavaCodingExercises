package com.java.generics;

import java.util.Scanner;

public class StringCountOfLetter {

	public static void main(String[] args) {
		int flag = 0, totalWordsCount = 0;
		String charArrayForString = " ";
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String stringArray = sc.nextLine();
		System.out.println(stringArray);
		char c1[] = charArrayForString.toCharArray();
		char s1[] = stringArray.toCharArray();
		for (int i = 0; i < stringArray.length(); i++) {
			System.out.print(s1[i]);
			totalWordsCount++;
			if (s1[i] == c1[0] || i == stringArray.length() - 1) {
				if (i == stringArray.length() - 1) {
					flag++;
					System.out.println("\t" + flag);
					System.out.println(" total number of letters in the sentence  =" + totalWordsCount);
	 				break;
				}
				System.out.print("\t" + flag);
				System.out.println();
				flag = 0;
				continue;
			}
			flag++;
		}
	}
}
