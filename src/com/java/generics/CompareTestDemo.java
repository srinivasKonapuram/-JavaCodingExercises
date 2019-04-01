/**
 * 
 */
package com.java.generics;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author srinivask
 *
 */
public class CompareTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("srinu");
		names.add("arun");
		names.add("sam");
		names.add("pramati");
		names.add("arjun");
		System.out.println(" data is " + names);
		Collections.sort(names,new ReverseStringComparator());
		System.out.println(" names in reverse order:"+names);
		List<String> data = new ArrayList<>();
		IntStream.of(1, 2, 3, 11, 21, 23, 31, 32, 41, 4, 42).forEach(element -> data.add(String.valueOf(element)));
		System.out.println("In normal Order is:" + data);
		Collections.sort(data, new ReverseStringComparator());
		System.out.println(data);
		Collections.shuffle(names);
		System.out.println(" Updated list after shufflig the list :"+names);
		Collections.swap(names, 1, 3);
		System.out.println(" swaped list is:"+ names);
		//sample list to add elements using Streams
		List<Integer> myinteger=new LinkedList<>();
		IntStream.of(15,16,17,18).forEach(element-> myinteger.add(element));
		System.out.println(" new integer list is :"+ myinteger);
		
		
		
	}

}
