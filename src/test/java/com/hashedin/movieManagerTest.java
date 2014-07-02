package com.hashedin;

import java.io.IOException;
import java.util.Map;

import junit.framework.TestCase;

public class movieManagerTest extends TestCase {
	public static void main(String[] args) throws IOException {
		movieManager m = new movieManager();
		movieManager r= new movieManager();
		Map<String, Movie> movieMap = m.getMovies(m.getClass().getClassLoader().getResourceAsStream("test_movie.txt"));
		
		//Map<String, Rating> movieRatingMap = r.getRating(r.getClass().getClassLoader().getResourceAsStream("test_ratings.txt"));
		Map<String, User> movieUserMap = r.getUser(r.getClass().getClassLoader().getResourceAsStream("test_user.txt"));
		Map<String, Gerne> movieGerneMap = r.getGerne(r.getClass().getClassLoader().getResourceAsStream("test_genre.txt"));
		assertEquals(movieMap.size(),3);
		//assertEquals(movieRatingMap.size(),3);
		assertEquals(movieUserMap.size(),3);
		assertEquals(movieGerneMap.size(),3);
		
	}
}
