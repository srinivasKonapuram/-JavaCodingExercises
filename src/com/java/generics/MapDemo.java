package com.java.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> data = new HashMap<>();
		data.put(1, "srinu");
		data.put(2, "sam");
		data.put(3, "arun");
		System.out.println(" name in map are :" + data);
		System.out.println("first name from the map :" + data.get(1));
		Set<Map.Entry<Integer, String>> myset = data.entrySet();
		for (Map.Entry<Integer, String> me : myset) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		data.put(1, "sri");
		System.out.println("updated  list is:" + data);
	}

}
