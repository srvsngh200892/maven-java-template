package com.hashedin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		//System.out.println("Most Axtive User Id ");
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String s = br.readLine();

		movieManager movie = new movieManager();

		MovieFrick moviefreaker = new MovieFrick();
		Map<String, Movie> movieMap = movie.getMovies(movie.getClass()
				.getClassLoader().getResourceAsStream("movie.data"));// reading
																		// and
																		// creating
																		// data
		List<Map> list = movie.getRating(movie.getClass().getClassLoader()
				.getResourceAsStream("ratings.data"));
		Map<String, User> movieUserMap = movie.getUser(movie.getClass()
				.getClassLoader().getResourceAsStream("user.data"));
		ArrayList<Gerne> movieGerneMap = movie.getGerne(movie.getClass()
				.getClassLoader().getResourceAsStream("genre.data"));
		ArrayList<Rater> rateMap = movie.getRater(movie.getClass()
				.getClassLoader().getResourceAsStream("ratings.data"));
		moviefreaker.mostWatched(list, movieMap); // function for calculating
													// most watched movie
		moviefreaker.mostActiveUser(list); // function for calculating most
											// Active User
		//moviefreaker.topMovieByGerne(movieGerneMap, s);// //function top movie
														// By Garner
		// System.out.println(movieMap);

		for (Rater ratingObj : rateMap) {
			Movie movieObj = movieMap.get(Integer.toString(ratingObj
					.getItemIds()));

			movieObj.setTotalRating(ratingObj.getRatings());

			User userObj = movieUserMap.get(ratingObj.getUserIds() );

		}

		// System.out.println("--------------------------------");
		Movie mostwatched = moviefreaker.highestRatedGenre(movieMap, rateMap,
				movieUserMap); // top rated movie
		System.out.println(mostwatched.getAverageRating());
	}

}
