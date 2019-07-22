package com.java.generics;

class Test<T extends Number> {
	T[] myarray;

	public Test(T[] myarray) {
		super();
		this.myarray = myarray;
	}

	Double findAverage() {
		double sum = 0.0;
		for (int i = 0; i < myarray.length; i++) {
			sum = sum + myarray[i].doubleValue();

		}
		return sum;

	}

	boolean checkIfTheAverageIsSame(Test<?> ob) {
		return findAverage() == ob.findAverage();
	}
}

public class GenericWithBoundVariables {
	public static void main(String[] args) {
		Integer integetrArray[] = { 1, 2, 3 };
		Test<Integer> intergerObject = new Test<Integer>(integetrArray);
		double firstAvearageValue = intergerObject.findAverage();
		System.out.println(" Integer average is:" + firstAvearageValue);

		Integer secondIntegerArray[] = { 1, 2, 3 };
		Test<Integer> secondIntegerObject = new Test<Integer>(secondIntegerArray);
		double secondAverageValue = secondIntegerObject.findAverage();
		System.out.println(" second Integrs average is:" + secondAverageValue);

		Double doubleArray[] = { 1.5, 2.5, 3.5 };
		Test<Double> stringObject = new Test<Double>(doubleArray);
		double doubleAverageValue = stringObject.findAverage();
		System.out.println(" Double average is" + firstAvearageValue);
		if (secondIntegerObject.checkIfTheAverageIsSame(stringObject))
			System.out.println("Double and integer Average is same");
		else
			System.out.println("Double and integer  Average is not");
		if (firstAvearageValue == secondAverageValue) {
			System.out.println(" integers Average  is same");

		} else
			System.out.println(" integer is  not same");

	}
}
