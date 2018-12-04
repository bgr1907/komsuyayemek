package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class MealHistory {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mealID;
	private Users userID;
	private Users profileID;
	private Posts postID;
	private Date createdDate;
	public int getMealID() {
		return mealID;
	}
	public void setMealID(int mealID) {
		this.mealID = mealID;
	}
	public Users getUserID() {
		return userID;
	}
	public void setUserID(Users userID) {
		this.userID = userID;
	}
	public Users getProfileID() {
		return profileID;
	}
	public void setProfileID(Users profileID) {
		this.profileID = profileID;
	}
	public Posts getPostID() {
		return postID;
	}
	public void setPostID(Posts postID) {
		this.postID = postID;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
