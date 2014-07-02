package com.hashedin;

import java.util.ArrayList;
//Contain Movie.data Field
public class Movie {

	private int id;
	private String title;
	private String releaseDate;
	private String imdbUrl;
	private int totalRating;
	private float averageRating;

	private int totalusercount;
	ArrayList<String> gener = new ArrayList<String>();

	public ArrayList<String> getGener() {
		return gener;
	}

	public void setGener(ArrayList<String> gener) {
		this.gener = gener;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getImdbUrl() {
		return imdbUrl;
	}

	public void setImdbUrl(String imdbUrl) {
		this.imdbUrl = imdbUrl;
	}

	public int getTotalRating() {
		return totalRating;
	}

	public void setTotalRating(int currentrating) {
		this.totalRating += currentrating;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float avg) {
		this.averageRating = avg;
	}

	public int getTotalusercount() {
		return totalusercount;
	}

	public void setTotalusercount(int totalusercount) {
		this.totalusercount = totalusercount;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate="
				+ releaseDate + ", imdbUrl=" + imdbUrl + ", totalRating="
				+ totalRating + ", averageRating=" + averageRating
				+ ", totalusercount=" + totalusercount + ", gener=" + gener
				+ "]";
	}

	

}
