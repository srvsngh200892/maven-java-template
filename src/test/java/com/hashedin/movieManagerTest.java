package com.hashedin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import junit.framework.TestCase;

public class movieManagerTest extends TestCase {
	public static void main(String[] args) throws IOException {
		movieManager m = new movieManager();
		movieManager r= new movieManager();
		Map<String, Movie> movieMap = m.getMovies(m.getClass().getClassLoader().getResourceAsStream("test_movie.txt"));
		
		//Map<String, Rating> movieRatingMap = r.getRater(r.getClass().getClassLoader().getResourceAsStream("test_ratings.txt"));
		Map<String, User> movieUserMap = r.getUser(r.getClass().getClassLoader().getResourceAsStream("test_user.txt"));
		ArrayList<Rater> rateMap = m.getRater(m.getClass()
				.getClassLoader().getResourceAsStream("ratings.data"));
		assertEquals(movieMap.size(),3);
		assertEquals(rateMap.size(),3);
		//assertEquals(movieUserMap.size(),3);
		//assertEquals(movieGerneMap.size(),3);
		
	}
}
