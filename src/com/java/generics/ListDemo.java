package com.java.generics;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<Integer>();

		data.add(2);
		data.add(3);
		data.add(3);
		System.out.println(" list is " + data);
		Integer newArray[] = new Integer[data.size()];
		newArray = data.toArray(newArray);

		int sum = 0;
		for (int i : newArray) {
			sum += i;
		}
		System.out.println(" sum of array is:" + sum);
	
	}
}
