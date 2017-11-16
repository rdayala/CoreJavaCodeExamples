package com.rdayala.comparablecomparator;

// implements Comparable for natural sorting order

public class Movie implements Comparable<Movie> {
	long movieID;
	String title;
	double rating;

	Movie(long movieID, String title, double rating) {
		this.movieID = movieID;
		this.title = title;
		this.rating = rating;
	}

	// override compareTo method, to sort movies based on movieID
	@Override
	public int compareTo(Movie movie) {
		if (movieID == movie.movieID)
			return 0;
		else if (movieID > movie.movieID)
			return 1;
		else
			return -1;
	}
}
