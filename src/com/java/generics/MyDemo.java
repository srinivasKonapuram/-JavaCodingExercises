package com.java.generics;

public class MyDemo {
	
  static void c1() {
	  System.out.println("c1");
  }
   MyDemo(){
	  System.out.println("c2");
  }
	public void c3() {
		System.out.println("c3");
	}
	public static void main(String[] args) {
		MyDemo m= new MyDemo();
		//MyDemo.c1();
		m.c3();
		MyDemo.c1();
	}
}
