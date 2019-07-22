package com.java.generics;

public class StringPostionsFunction {
	int res = 0;
	String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}";

	public void includevowels(String inputString) {

		char[] c1 = inputString.toCharArray();
		System.out.println(" main data is" + c1.toString());

		for (int i = 0; i < c1.length; i++) {
			if (specialCharacters.contains(Character.toString(inputString.charAt(i))))
				;

			{
				res += 0;
			}
			if (c1[i] >= 'a' && c1[i] <= 'z') {
				int temp = (int) c1[i];
				int temp_integer = 96; // for lower case
				if (temp <= 122 & temp >= 97)
					res += temp - temp_integer;
			}
			else {
				int temp = (int) c1[i];
				int temp_integer = 64; // for upper case
				if (temp <= 90 & temp >= 65)
					res += temp - temp_integer;
			}
		}
		System.out.println(" results" + res);
	}

	public void avoidvowels(String inputString) {
		char[] c1 = inputString.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == 'a' || c1[i] == 'e' || c1[i] == 'i' || c1[i] == 'o'
					|| c1[i] == 'u' && specialCharacters.contains(Character.toString(inputString.charAt(i)))) {
				res += 0;
			} else {
				if (c1[i] >= 'a' && c1[i] <= 'z') {
					int temp = (int) c1[i];
					int temp_integer = 96; // for lower case
					if (temp <= 122 & temp >= 97)
						res += temp - temp_integer;
				} else {
					int temp = (int) c1[i];
					int temp_integer = 64; // for upper case
					if (temp <= 90 & temp >= 65)
						res += temp - temp_integer;
				}
			}
		}
		System.out.println(" results" + res);
	}
}
