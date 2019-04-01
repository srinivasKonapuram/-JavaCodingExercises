package com.java.generics;

import java.util.Comparator;

public class ReverseStringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//return  Integer.valueOf(o1);
		return o2.compareTo(o1);
	}

}
