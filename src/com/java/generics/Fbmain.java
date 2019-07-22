package com.java.generics;

public class Fbmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FbDemo myfb= new FbDemo();
		myfb.add();
		switch(myfb.option) {
		case 1:
			System.out.println(" in case 1");
			myfb.add();
			break;
			default:
				
				System.out.println( "right");
				break;
		}
	
	}

}
