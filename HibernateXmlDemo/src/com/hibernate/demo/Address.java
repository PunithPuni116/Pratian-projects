package com.hibernate.demo;

public class Address {
	private long userId;
	private String streetName;
	private String city;
	private long pincode;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public Address(long userId, String streetName, String city, long pincode) {
		super();
		this.userId = userId;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	};
	
	
	
}
