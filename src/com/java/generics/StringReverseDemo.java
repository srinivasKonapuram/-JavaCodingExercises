package com.java.generics;

public class StringReverseDemo {
	String reverseString = "'";

	public String reverseWordByWord(String str) {
		String charlenght = " ";
		char[] chararray = charlenght.toCharArray();

		int strLeng = str.length() - 1;
		char[] arrayOfStringToreverse = str.toCharArray();
		// int lenghtarray = str.length() - 1;
		String reverse = "", temp = "";
		for (int i = 0; i <= strLeng; i++) {
			temp += arrayOfStringToreverse[i];
			if ((arrayOfStringToreverse[i] == chararray[0]) || (i == strLeng)) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					reverse += temp.charAt(j);
					if ((j == 0) && (i != strLeng))
						reverse += " ";
				}
				temp = "";
			}

		}

		System.out.println(" each word " + temp);
		return temp;

	}

	public String sentenceReverse(String inputString) {
		char[] charArrayOfString = inputString.toCharArray();
		for (int i = charArrayOfString.length - 1; i >= 0; i--) {
			reverseString += charArrayOfString[i];
		}
		System.out.println(" Sentence reverse" + reverseString);
		return reverseString;
	}
}
