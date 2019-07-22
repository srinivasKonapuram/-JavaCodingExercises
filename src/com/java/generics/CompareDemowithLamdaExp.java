package com.java.generics;

import java.util.Comparator;
//import java.util.Date;
import java.util.TreeSet;

class mycom implements Comparator<String>{
	public int 	compare(String astr , String bstr) {
		return astr.compareTo(bstr);
	}
	
	
}
public class CompareDemowithLamdaExp {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>( new mycom());
				
		myset.add("c");
		myset.add("java");
		myset.add("c++");
		myset.add("c#");
		myset.add("php");
		myset.add("sql");
		 for(String element:myset) {
			 System.out.println(element + " ");
			 
			 System.out.println();
		 }
		/*
		 * mport java.util.*; public class Main { public static void main(String[] args)
		 * { String s2; int flag=0; String c=" "; System.out.println("Enter a string");
		 * Scanner sc=new Scanner(System.in); String s=sc.nextLine(); // char []
		 * s3=s.toCharArray(); System.out.println(s); char c1[]=c.toCharArray(); for(int
		 * i=0;i<s.length();i++){ System.out.print(s.charAt(i));
		 * if(s.charAt(i)==c1[0]||i==s.length()-1){ if(i==s.length()-1){ flag++;
		 * System.out.print("\t"+flag); break; } System.out.print("\t"+flag); flag=0;
		 * continue; } flag++; } } }
		 */
//		Date mydate=new Date();
//		System.out.println(" current date is :"+ mydate);
//		System.out.println(mydate.before(mydate));
//		System.out.println(mydate.getHours());

	}

}
