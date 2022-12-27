package com.sa.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity //Maps a table in DB
@Table(name="address1") //Table name //Optional
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_generator")
	@SequenceGenerator(sequenceName = "address_seq", name = "address_generator")
	private long id;
	
	private String streetName;
	private String city;
	
	//@Column(name="addressPincode") //Column names //Optional
	private long pincode;
	
	public Address() {
		super();
	}

	public Address(long id, String streetName, String city, long pincode) {
		super();
		this.id = id;
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
