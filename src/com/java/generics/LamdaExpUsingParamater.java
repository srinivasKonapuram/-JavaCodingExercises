package com.java.generics;

interface StirnFunc {
	String func(String n);

}

class LamdaExpUsingParamater {

	static String stringOperation(StirnFunc stringFuc, String myString) {
		return stringFuc.func(myString);
	}

	public static void main(String[] args) {
		String inputString = "srinu is good boy";
		String outputString;
		System.out.println(" here is input string is:" + inputString);
		outputString = stringOperation((str) -> str.toUpperCase(), inputString);
		System.out.println(" upper case is :" + outputString);

		// lamda expersion for removing space in string
		outputString = stringOperation((str) -> {
			String result = "";
			int i;
			for (i = 0; i < str.length(); i++)
				if (str.charAt(i) != ' ')

					result += str.charAt(i);
			return result;

		}, inputString);
		System.out.println(" string without space " + outputString);
	}
}
