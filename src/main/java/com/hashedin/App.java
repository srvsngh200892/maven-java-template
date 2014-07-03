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
			   movieObj.setTotalusercount(1);


			movieObj.setTotalRating(ratingObj.getRatings());

			User userObj = movieUserMap.get(ratingObj.getUserIds() );

		}
       
		
		
		Movie mostwatched = moviefreaker.highestRatedGenre(movieMap, rateMap,
				movieUserMap); // top rated movie
		System.out.println("Most Watched Movie");
		System.out.println(mostwatched.getTitle());
		System.out.println("Enter the year to see top most movie by year");
		 BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		    String T=inp.readLine();
		int movieId=moviefreaker.topMovieByYear(movieMap,T);
		
		System.out.println("Most Rated Movie");
		System.out.println(movieMap.get(Integer.toString(movieId)).getTitle());
	}

}
