package com.java.generics;

class MyException extends Exception {
	private int detials;

	public MyException(int a) {

		detials = a;
	}

	public String tostring() {
		return "Exception[" + detials + "]";
	}
}

public class ExeceptionDemo {
	static void myCompute(int a) throws MyException {
		System.out.println("called compute(" + a + ")");
		if (a > 10)
			throw new MyException(a);
		System.out.println(" normal exit");

	}

	public static void main(String[] args) {
		try {
			myCompute(1);
			myCompute(20);

		} catch (MyException e) {
			System.out.println(" error" + e);
		}
	}
}
