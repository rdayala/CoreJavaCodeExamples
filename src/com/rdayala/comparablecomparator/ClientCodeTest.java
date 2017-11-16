package com.rdayala.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class ClientCodeTest {

	public static void main(String[] args) {	

		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new Movie(2, "Arundathi", 4.3));
		movies.add(new Movie(1, "Bahubhali", 6.7));
		movies.add(new Movie(3, "Fidaa", 2.1));

		// natural sorting order based on movieID
		System.out.println("Sorting by movieID, natural sorting order ...");
		Collections.sort(movies);
		for (Movie movie : movies) {
			System.out.println(movie.movieID + " " + movie.title + " " + movie.rating);
		}

		System.out.println("Sorting by title ...");
		Collections.sort(movies, new TitleComparator()); // passing comparator object to sort method
		for (Movie movie : movies) {
			System.out.println(movie.movieID + " " + movie.title + " " + movie.rating);
		}

		System.out.println("Sorting by rating ...");
		Collections.sort(movies, new RatingComparator()); // passing comparator object to sort method
		for (Movie movie : movies) {
			System.out.println(movie.movieID + " " + movie.title + " " + movie.rating);
		}
	}

}
