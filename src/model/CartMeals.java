package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CartMeals {
	
	private Users userID;
	
	private Cart cartID;
	private Posts postID;
	
	public CartMeals() {
		super();
	}
	public Users getUserID() {
		return userID;
	}
	public void setUserID(Users userID) {
		this.userID = userID;
	}
	public Cart getCartID() {
		return cartID;
	}
	public void setCartID(Cart cartID) {
		this.cartID = cartID;
	}
	public Posts getPostID() {
		return postID;
	}
	public void setPostID(Posts postID) {
		this.postID = postID;
	}
	
}
