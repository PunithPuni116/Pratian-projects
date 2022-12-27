package com.HeartiHealth;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class AddressInfo {
	@Id
	private String addressId;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	
	
	//@ManyToOne
	
	
	//getters and setters
	public String getAddressId() {
		return addressId;
	}


	


	public AddressInfo(String addressId, String city, String state, String country, String pinCode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}





	public void setAddressId(String string) {
		this.addressId = string;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String string) {
		this.pinCode = string;
	}


	

}
