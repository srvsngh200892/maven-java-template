package com.hashedin;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.IOUtils;

public class movieManager {

	public Map<String, Movie> getMovies(InputStream movieStream)  //getting the movie.data files data
			throws IOException {

		Map<String, Movie> movieMap = new HashMap<>();
		List<String> lines = IOUtils.readLines(movieStream); // reading it line by line

		for (String line : lines) {
			Movie m = parseMovie(line);
			movieMap.put(Integer.toString(m.getId()), m);
			//System.out.println(m);
		}
		return movieMap;
	}

	Movie parseMovie(String movieRecord) {
		StringTokenizer token = new StringTokenizer(movieRecord, "|");//spliting by |
		Movie m = new Movie();
		m.setId(Integer.parseInt(token.nextToken()));
		m.setTitle(token.nextToken());
		m.setReleaseDate(token.nextToken());
		m.setImdbUrl(token.nextToken());
		
		
		return (m);
	}

	public List< Map> getRating(InputStream ratingStream)
			throws IOException {

		Map<String, Rating> movieRatingMap = new HashMap<>();
		List<String> lines = IOUtils.readLines(ratingStream);
		List<Map> list = new ArrayList<>();
		for (String line : lines) {
			
			StringTokenizer token = new StringTokenizer(line, "\t");
			
		  
			Map<String,String> mMap = new HashMap<>();
			
			
			mMap.put("start",token.nextToken());
			
			mMap.put("itemid",token.nextToken());
			mMap.put("rating",token.nextToken());
			mMap.put("tamptimest",token.nextToken());
			list.add(mMap);
			
			
			
		}
	

		    //System.out.println("Most Watched "+maxKey1); 
		
		//System.out.println(frequencyHash2);
		return list;
	}

	List<Map> parseMovierating(String ratingRecord) {
		StringTokenizer token = new StringTokenizer(ratingRecord, "\t");
		Rating r = new Rating();
	  
		Map<String,String> mMap = new HashMap<>();
		List<Map> list = new ArrayList<>();
		
		mMap.put("start",token.nextToken());
		
		mMap.put("itemid",token.nextToken());
		mMap.put("rating",token.nextToken());
		mMap.put("tamptimest",token.nextToken());
		list.add(mMap);

		
		
		
		
		return (list);
	}

	public Map<String, User> getUser(InputStream userStream) throws IOException {

		Map<String, User> movieUserMap = new HashMap<>();
		List<String> lines = IOUtils.readLines(userStream);

		for (String line : lines) {
			User u = parseMovieUser(line);
			movieUserMap.put(Integer.toString(u.getUserId()), u);
			//System.out.println(u);
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

	public ArrayList<Gerne> getGerne(InputStream gerneStream)
			throws IOException {

		ArrayList<Gerne> movieGerneMap = new ArrayList<Gerne>();
		List<String> lines = IOUtils.readLines(gerneStream);

		for (String line : lines) {
			Gerne g = parseGerneUser(line);
			movieGerneMap.add(g);
			//System.out.println(g);
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
	
	
	public ArrayList<Rater> getRater(InputStream movieStream)
			throws IOException {

		ArrayList<Rater> rateMap = new ArrayList<Rater>();
		List <String> lines = IOUtils.readLines(movieStream);

		for (String line : lines) {
			Rater rate = parseRate(line);
			rateMap.add(rate);
			//System.out.println(rate);
		}
		
		//System.out.println(rateMap.get(1));
		return rateMap;
		
}					

	Rater parseRate(String movieRecord) {
			StringTokenizer token = new StringTokenizer(movieRecord, "	");
			Rater rate = new Rater();
			rate.setUserIds(Integer.parseInt(token.nextToken()));
			rate.setItemIds(Integer.parseInt(token.nextToken()));
			rate.setRatings(Integer.parseInt(token.nextToken()));
			rate.setTimestamps(Integer.parseInt(token.nextToken()));
			return (rate);

			
		}
			

	

}
