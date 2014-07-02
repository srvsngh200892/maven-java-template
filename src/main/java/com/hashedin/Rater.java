package com.hashedin;

public class Rater {
	private int userIds;
	private int itemIds;
	private int ratings;
	private int timestamps;

	public int getUserIds() {
		return userIds;
	}

	public void setUserIds(int userIds) {
		this.userIds = userIds;
	}

	public int getItemIds() {
		return itemIds;
	}

	public void setItemIds(int itemIds) {
		this.itemIds = itemIds;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public int getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(int timestamps) {
		this.timestamps = timestamps;
	}

	@Override
	public String toString() {
		return "Rater [userIds=" + userIds + ", itemIds=" + itemIds
				+ ", ratings=" + ratings + ", timestamps=" + timestamps + "]";
	}

}
