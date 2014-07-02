package com.hashedin;

import java.util.ArrayList;

public class Movie {
	
	private int id;
	private String title;
	private String releaseDate;
	private String imdbUrl;
	private int totalRating;
	private int averageRating;
	ArrayList<String>gener =new ArrayList<String>();
	


	
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
	public int getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate="
				+ releaseDate + ", imdbUrl=" + imdbUrl + ", totalRating="
				+ totalRating + ", averageRating=" + averageRating + ", gener="
				+ gener + "]";
	}
	

	
	
	
	

}
