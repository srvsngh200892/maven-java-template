package com.hashedin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.IOUtils;

public class MovieFrick {
	public void mostWatched(List<Map> list, Map<String, Movie> movieMap) {

		// function is calculating most watched movie

		List<Object> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {

			list2.add((list.get(i).get("itemid")));
		}
		// System.out.println(list1);

		Hashtable<Object, Integer> frequencyHash2 = new Hashtable();

		ArrayList uniqueList2 = new ArrayList();

		for (int i = 0; i < list2.size(); i++) {
			if (uniqueList2.contains(list2.get(i))) {
				int elementCount2 = frequencyHash2.get(list2.get(i));

				elementCount2++;
				frequencyHash2.put(list2.get(i), elementCount2);
			} else {
				uniqueList2.add(list2.get(i));
				frequencyHash2.put(list2.get(i), 1);
			}
		}

		Object maxKey1 = null;
		Integer maxValue2 = Integer.MIN_VALUE;
		for (Map.Entry<Object, Integer> entry : frequencyHash2.entrySet()) {
			if (entry.getValue() > maxValue2) {
				maxValue2 = entry.getValue();
				maxKey1 = entry.getKey();
			}
		}

		System.out.println("Most Watched " + movieMap.get(maxKey1).getTitle());

		// System.out.println(frequencyHash2);

	}

	public void mostActiveUser(List<Map> list) {

		// function is calculating most Active User

		List<Object> list1 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {

			list1.add((list.get(i).get("itemid")));
		}
		Hashtable<Object, Integer> frequencyHash = new Hashtable();
		// Hashtable<Object, Integer> frequencyHash2 = new Hashtable();

		ArrayList uniqueList = new ArrayList();
		// ArrayList uniqueList2 = new ArrayList();

		for (int i = 0; i < list1.size(); i++) {
			if (uniqueList.contains(list1.get(i))) {
				int elementCount = Integer.parseInt(frequencyHash.get(
						list1.get(i)).toString());

				elementCount++;
				frequencyHash.put(list1.get(i), elementCount);
			} else {
				uniqueList.add(list1.get(i));
				frequencyHash.put(list1.get(i), 1);
			}
		}

		Object maxKey = null;
		Integer maxValue = Integer.MIN_VALUE;
		for (Map.Entry<Object, Integer> entry : frequencyHash.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		System.out.println("Most Axtive User Id " + maxKey);

	}

	public void topMovieByGerne(ArrayList<Gerne> movieGerneMap, String s) {

		for (int i = 0; i < movieGerneMap.size(); i++) {

			// System.out.println(movieGerneMap.get(i));
		}

	}

	public Movie highestRatedGenre(Map<String, Movie> movieMap,
			ArrayList<Rater> rateMap, Map<String, User> usrMap) {

		// function is calculating highest rated movie

		List<Movie> movieList = new ArrayList<Movie>(movieMap.values());
		// List<User> userList = new ArrayList<User>(usrMap.values());
		// System.out.println(movieList);
		for (Movie m : movieList) {
			float avg = findAverage(m.getTotalRating(), m.getTotalusercount());
			m.setAverageRating(avg);
			// System.out.println(m.getAvg());
		}

		Movie highestRated = Collections.max(movieList,
				new Comparator<Movie>() {
					@Override
					public int compare(Movie first, Movie second) {
						if (first.getAverageRating() > second
								.getAverageRating())
							return 1;
						else if (first.getAverageRating() < second
								.getAverageRating())
							return -1;
						return 0;
					}
				});
		// System.out.println(highestRated.getAvg());
		return highestRated;

	}

	public float findAverage(int totalRatings, int totalUserCount) {

		return (float) totalRatings / (float) totalUserCount;

	}

	public int topMovieByYear(Map<String, Movie> movieMap,String T) {
		Integer maxKey = null;
		Float maxValue = (float) Integer.MIN_VALUE;
		for (Movie entry : movieMap.values()) {
			String year = entry.getReleaseDate();
			// System.out.println(year);
			String[] parts = year.split("-");
			//System.out.println(parts[2]);
			//System.out.println(entry.getId());
			
			
			//System.out.println(x);
			
			HashMap<Integer, Float> myMap = new HashMap<Integer, Float>();
			if (parts[2].equals(T)) {

				myMap.put(entry.getId(), entry.getAverageRating());
				//System.out.println(myMap);
			}

			for (Map.Entry<Integer, Float> entr : myMap.entrySet()) {
				if (entr.getValue() > maxValue) {
					maxValue = entr.getValue();
					maxKey = entr.getKey();
				}

			}
			
		}
		return(maxKey);
	}
}
