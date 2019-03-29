package com.java.generics;

class Gen<T, V> {

	T ob;
	V ob1;

	Gen(T o, V v) {
		// super();
		this.ob = o;
		this.ob1 = v;
	}

	T getob() {

		return ob;

	}

	V getob1() {
		return ob1;
	}

	void showType() {
		System.out.println("type T is " + ob.getClass().getName());
		System.out.println("type t is " + ob1.getClass().getName());
	}
}

class GenDemo {
	public static void main(String[] args) {
		Gen<Integer, String> iOb;
		iOb = new Gen<Integer, String>(88, "srinu");
		iOb.showType();
		int v = iOb.getob();
		int str = iOb.getob();
		System.out.println("value of T is :" + v + " value of T" + str);
	}
}