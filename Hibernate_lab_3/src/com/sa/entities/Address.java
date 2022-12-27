package com.sa.entities;

public class Address {
	private long id; 
	private String streetName;
	private String city;
	private long pincode;
	
	
	
	public Address( String streetName, String city, long pincode) {
		
		//this.id = id;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	
	
	
	

}
