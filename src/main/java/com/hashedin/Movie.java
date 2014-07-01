package com.hashedin;

public class Movie {
	
	private int id;
	private String title;
	private String releaseDate;
	private String imdbUrl;
	


	
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
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate="
				+ releaseDate + ", imdbUrl=" + imdbUrl + "]";
	}

	
	
	

}
