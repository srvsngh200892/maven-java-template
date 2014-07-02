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
public class App 
{
	public static void main(String[] args) throws IOException {
		System.out.println("Most Axtive User Id ");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String s = br.readLine();
	
		
		movieManager m = new movieManager();
		movieManager r = new movieManager();
		MovieFrick M = new MovieFrick();
		Map<String, Movie> movieMap = m.getMovies(m.getClass().getClassLoader()
				.getResourceAsStream("movie.data"));
		List<Map> list = r.getRating(r.getClass()
				.getClassLoader().getResourceAsStream("ratings.data"));
		Map<String, User> movieUserMap = r.getUser(r.getClass()
				.getClassLoader().getResourceAsStream("user.data"));
		ArrayList<Gerne> movieGerneMap = r.getGerne(r.getClass()
				.getClassLoader().getResourceAsStream("genre.data"));
		ArrayList<Rater>rateMap=r.getRater(r.getClass()
				.getClassLoader().getResourceAsStream("ratings.data"));
		M.mostWatched(list,movieMap);
		M.mostActiveUser(list);
		M.topMovieByGerne(movieGerneMap,s);
		//System.out.println(movieMap);
		 for(Rater ratingObj :rateMap ) {
			   Movie movieObj = movieMap.get(ratingObj.getItemIds());
			   
			   movieObj.setTotalRating(ratingObj.getRatings());
		 // System.out.println(movieObj.getTotalUserCount());
		 // System.out.println(movieObj.getTotalRatings());
			// System.out.println(movieObj);
			 User userObj = movieUserMap.get(ratingObj.getUserIds());
			
			// System.out.println(userObj);
			 }
			 
			// System.out.println("--------------------------------");
			
			

	}
	
}
