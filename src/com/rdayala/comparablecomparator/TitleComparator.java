package com.rdayala.comparablecomparator;

import java.util.Comparator;

// we are using the compareTo() method of String class, 
// which internally provides the comparison logic.

public class TitleComparator implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) {
		// since title is of String type, making use of 
		// String's comparable sorting order
		return m1.title.compareTo(m2.title);
	}
}
