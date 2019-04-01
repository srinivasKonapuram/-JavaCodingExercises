package com.java.generics;

class GenericDemo<IntegerGeneric, StringGeneric> {

	IntegerGeneric myInteger;
	StringGeneric myString;

	GenericDemo(IntegerGeneric first, StringGeneric second) {
		// super();
		this.myInteger = first;
		this.myString = second;
	}

	IntegerGeneric myIntegerFunc() {

		return myInteger;

	}

	StringGeneric myStringFunc() {
		return myString;
	}

	void showType() {
		System.out.println("type T is " + myInteger.getClass().getName());
		System.out.println("type t is " + myString.getClass().getName());
	}
}

class GenDemo {
	public static void main(String[] args) {
		GenericDemo<Integer, String> genericObject;
		genericObject = new GenericDemo<Integer, String>(88, "srinu");
	
		genericObject.showType();
		int value = genericObject.myIntegerFunc();
		String str = genericObject.myStringFunc();
		System.out.println("value of IntegerGeneric is :" + value + " /" + "value of StringGeneric:" + str);
	}
}