package com.java.generics;

import java.util.HashSet;
import java.util.Scanner;

import com.java.generics.Employer.AddingEmp;

public class TestSample {

	public void add() {
		Employer srinu = new Employer();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		srinu.empName = sc.nextLine();
		sc.nextLine();
		System.out.println(" enter id");
		srinu.empID = sc.nextInt();
		sc.nextLine();
		System.out.println(" enter designation");
		srinu.empDesignation = sc.nextLine();			
		HashSet<Employer> employer = new HashSet<>();
		employer.add(srinu);
		employer.add(srinu);
		for (Employer b : employer)
			System.out.println(b.empID + " " + b.empName + " " + b.empDesignation);
	}

	public void selection() {
		System.out.println(" enter the choice: ");
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.Add an Employee  2. display the of list employee");
		int option2=sc.nextInt();
		
	}
	
//	public void display( ) {
//	for (Employer b : e)
//			System.out.println(b.empID + " " + b.empName + " " + b.empDesignation);
//	}

	public static void main(String[] args) {
		TestSample a = new TestSample();
		 
		int option;
		System.out.println(" enter the choice: ");
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.Add a Employee  2. display the of list employee");
		option=sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(" Adding Employee");
			a.add();
			a.selection();
			break;
		case 2:
			// System.out.println(" list of empyoees are :"+employer);
			break;
		default:
			System.out.println(" enter the right choice ");
			break;

		}

	}

}
