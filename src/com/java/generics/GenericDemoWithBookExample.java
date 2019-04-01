package com.java.generics;

import java.util.HashSet;

class Books<Integer, string> {
	int id, quantity;
	string author, names, publisher;

	public Books(int id, int quantity, string author, string names, string publisher) {
		this.id = id;
		this.quantity = quantity;
		this.author = author;
		this.names = names;
		this.publisher = publisher;
	}

}

public class GenericDemoWithBookExample {
	public static void main(String[] args) {
		HashSet<Books> set = new HashSet<>();
		Books b1 = new Books(101, 8, "Let us C", "Yashwant Kanetkar", "BPB");
		Books b2 = new Books(102, 4, "Data Communications & Networking", "Forouzan", "Mc Graw Hill");
		Books b3 = new Books(103, 6, "Operating System", "Galvin", "Wiley");
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for (Books b : set)
			System.out.println(b.id + " " + b.quantity + " " + b.author + " " + b.publisher + " " + b.names);
	}
}
