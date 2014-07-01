package com.hashedin;

public class Rating {
	
	private int userId;
	private String itemId;
	private String rating;
	private String timestamp;

	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", itemId=" + itemId + ", rating="
				+ rating + ", timestamp=" + timestamp + "]";

}
}
