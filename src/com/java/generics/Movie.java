package com.java.generics;

import java.util.Comparator;

public class Movie implements Comparable<Movie> {

	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie m) {
		return this.year - m.year;
	}

	public Movie(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}

class RattingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;

	}

}

class NameCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}
