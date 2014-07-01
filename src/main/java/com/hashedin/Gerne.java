package com.hashedin;

public class Gerne {
	private String genre;
	private int genreId;
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Gerne [genre=" + genre + ", genreId=" + genreId + "]";
	}
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	

}
