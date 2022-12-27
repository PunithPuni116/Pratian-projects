package com.sa.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonalProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long profileId;
	public long mobileNo;
	public boolean relocate;
	public LocalDate dateOfBirth;
	
	
	
	public PersonalProfile() {
		super();
	}
	

	public PersonalProfile( long mobileNo, boolean relocate, LocalDate dateOfBirth) {
		super();
		this.mobileNo = mobileNo;
		this.relocate = relocate;
		this.dateOfBirth = dateOfBirth;
	}
	
	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public boolean isRelocate() {
		return relocate;
	}
	public void setRelocate(boolean relocate) {
		this.relocate = relocate;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
