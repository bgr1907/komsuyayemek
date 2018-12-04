package model;

import javax.persistence.Entity;

@Entity
public class Favorites {
	private Users userID;
	private Users profileID;
	
	public Favorites() {
		super();
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

	
	
}
