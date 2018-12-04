package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comments {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int commentID;
	private Users userID;
	private Users profileID;
	private String comment;
	private byte servicePoint;
	private byte tastePoint;
	private Date createdDate;
	
	public Comments() {
		super();
	}

	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public byte getServicePoint() {
		return servicePoint;
	}

	public void setServicePoint(byte servicePoint) {
		this.servicePoint = servicePoint;
	}

	public byte getTastePoint() {
		return tastePoint;
	}

	public void setTastePoint(byte tastePoint) {
		this.tastePoint = tastePoint;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
