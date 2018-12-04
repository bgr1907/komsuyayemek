package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Addresses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressID;
	private Users userID;
	private String city;
	private String district;
	private String addressType;
	private String addressTitle;
	private String adress;
	private String adressDescription;
	private String phoneNumber;
	public Addresses() {
		super();
	}
	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public Users getUserID() {
		return userID;
	}
	public void setUserID(Users userID) {
		this.userID = userID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddressTitle() {
		return addressTitle;
	}
	public void setAddressTitle(String addressTitle) {
		this.addressTitle = addressTitle;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAdressDescription() {
		return adressDescription;
	}
	public void setAdressDescription(String adressDescription) {
		this.adressDescription = adressDescription;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
