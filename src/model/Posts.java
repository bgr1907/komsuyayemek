package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Posts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int postID;
	private Users profileID;
	private String postType;
	private String postName;
	private short count;
	private String timeIntervalStart;
	private String timeIntervalFinish;
	private boolean state;
	public int getPostID() {
		return postID;
	}
	public void setPostID(int postID) {
		this.postID = postID;
	}
	public Users getProfileID() {
		return profileID;
	}
	public void setProfileID(Users profileID) {
		this.profileID = profileID;
	}
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public short getCount() {
		return count;
	}
	public void setCount(short count) {
		this.count = count;
	}
	public String getTimeIntervalStart() {
		return timeIntervalStart;
	}
	public void setTimeIntervalStart(String timeIntervalStart) {
		this.timeIntervalStart = timeIntervalStart;
	}
	public String getTimeIntervalFinish() {
		return timeIntervalFinish;
	}
	public void setTimeIntervalFinish(String timeIntervalFinish) {
		this.timeIntervalFinish = timeIntervalFinish;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
}
