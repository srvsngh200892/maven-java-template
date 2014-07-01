package com.hashedin;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.IOUtils;

public class movieManager {

	public Map<String, Movie> getMovies(InputStream movieStream)
			throws IOException {

		Map<String, Movie> movieMap = new HashMap<>();
		List<String> lines = IOUtils.readLines(movieStream);

		for (String line : lines) {
			Movie m = parseMovie(line);
			movieMap.put(Integer.toString(m.getId()), m);
			System.out.println(m);
		}
		return movieMap;
	}
	Movie parseMovie(String movieRecord) {
		StringTokenizer token = new StringTokenizer(movieRecord, "|");
		Movie m = new Movie();
		m.setId(Integer.parseInt(token.nextToken()));
		m.setTitle(token.nextToken());
		m.setReleaseDate(token.nextToken());
		m.setImdbUrl(token.nextToken());
		return (m);
	}

	public Map<String, Rating> getRating(InputStream ratingStream)
			throws IOException {

		Map<String,Rating> movieRatingMap = new HashMap<>();
		List<String> lines = IOUtils.readLines(ratingStream);

		for (String line : lines) {
			Rating r = parseMovierating(line);
			movieRatingMap.put(Integer.toString(r.getUserId()), r);
			System.out.println(r);
		}
		return movieRatingMap;
	}
	Rating parseMovierating(String ratingRecord) {
		StringTokenizer token = new StringTokenizer(ratingRecord, "\t");
		Rating r = new Rating();
	
		r.setUserId(Integer.parseInt(token.nextToken()));
		r.setItemId(token.nextToken());
		r.setRating(token.nextToken());
		r.setTimestamp(token.nextToken());
		return (r);
	}
	public Map<String, User> getUser(InputStream userStream)
			throws IOException {

		Map<String,User> movieUserMap = new HashMap<>();
		List<String> lines = IOUtils.readLines(userStream);

		for (String line : lines) {
			User u = parseMovieUser(line);
			movieUserMap.put(Integer.toString(u.getUserId()), u);
			System.out.println(u);
		}
		return movieUserMap;
	}
	User parseMovieUser(String userRecord) {
		StringTokenizer token = new StringTokenizer(userRecord, "|");
		User u = new User();
	
		u.setUserId(Integer.parseInt(token.nextToken()));
		u.setAge(token.nextToken());
		u.setGender(token.nextToken());
		u.setOccupation(token.nextToken());
		u.setZipcode(token.nextToken());
		return (u);
	}
	public Map<String, Gerne> getGerne(InputStream gerneStream)
			throws IOException {

		Map<String,Gerne> movieGerneMap = new HashMap<>();
		List<String> lines = IOUtils.readLines(gerneStream);

		for (String line : lines) {
			Gerne g = parseGerneUser(line);
			movieGerneMap.put(Integer.toString(g.getGenreId()), g);
			System.out.println(g);
		}
		return movieGerneMap;
	}
	Gerne parseGerneUser(String gerneRecord) {
		StringTokenizer token = new StringTokenizer(gerneRecord, "|");
		Gerne g = new Gerne();
		g.setGenre(token.nextToken());
		g.setGenreId(Integer.parseInt(token.nextToken()));
		
		
		return (g);
	}
	public static void main(String[] args) throws IOException {
		movieManager m = new movieManager();
		movieManager r = new movieManager();
		Map<String, Movie> movieMap = m.getMovies(m.getClass().getClassLoader().getResourceAsStream("movie.data"));
		Map<String, Rating> movieRatingMap = r.getRating(r.getClass().getClassLoader().getResourceAsStream("ratings.data"));
		Map<String, User> movieUserMap = r.getUser(r.getClass().getClassLoader().getResourceAsStream("user.data"));
		Map<String, Gerne> movieGerneMap = r.getGerne(r.getClass().getClassLoader().getResourceAsStream("genre.data"));
	}
	
}
