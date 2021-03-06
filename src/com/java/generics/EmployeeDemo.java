package com.java.generics;

import java.util.Arrays;

public class EmployeeDemo implements Comparable<EmployeeDemo> {
	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public EmployeeDemo(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeDemo emp) {
		return (this.id - emp.id);

	}

	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}
	public static void main(String[] args) {
		EmployeeDemo[] empArr = new EmployeeDemo[4];
		empArr[0] = new EmployeeDemo(10, "Mikey", 25, 10000);
		empArr[1] = new EmployeeDemo(20, "Arun", 29, 20000);
		empArr[2] = new EmployeeDemo(5, "Lisa", 35, 5000);
		empArr[3] = new EmployeeDemo(1, "Pankaj", 32, 50000);
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
	}

}
