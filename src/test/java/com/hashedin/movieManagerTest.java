package com.hashedin;

import java.io.IOException;
import java.util.Map;

import junit.framework.TestCase;

public class movieManagerTest extends TestCase {
	public static void main(String[] args) throws IOException {
		movieManager m = new movieManager();
		Map<String, Movie> movieMap = m.getMovies(m.getClass().getClassLoader().getResourceAsStream("test_movie.txt"));
		assertEquals(movieMap.size(),3);
	}
}
