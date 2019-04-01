/**
 * 
 */
package com.java.generics;

interface Mynumber {
	int func(int n);
}

public class Simple {
	public static void main(String[] args) {
		Mynumber factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++)
				result = i * result;
			return result;

		};
		System.out.println("factorial of a number is:" + factorial.func(3));
	}

}
