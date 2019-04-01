package com.java.generics;

interface SomeFunc<T> {
	T func(T t);
}

class ReverseOfString {
	public static void main(String[] args) {
		SomeFunc<String> reverseOfString = (str) -> {
			String result = " ";
			int i;
			for (i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;

		};
		System.out.println("  wrong word is" + reverseOfString.func("srinu"));
		System.out.println("  right word is" + reverseOfString.func("unirs"));

		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;
		};
		System.out.println("factorial of number is" + factorial.func(5));
	}

}
