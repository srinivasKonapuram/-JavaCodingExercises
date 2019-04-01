package com.java.generics;

import java.util.function.Predicate;

public class PredicatesDemo {
	public static void main(String args[]) {
		Predicate<Integer> lessthan = i -> (i < 18);
		
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
		Predicate<Integer> greaterThanTen=(i)   -> i < 10; 
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
        System.out.println(result); 
  
        // Calling Predicate method 
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
        System.out.println(result2);  	 	
		System.out.println(lessthan.test(10));
	}

}
