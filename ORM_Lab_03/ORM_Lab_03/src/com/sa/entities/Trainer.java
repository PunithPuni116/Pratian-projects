package com.sa.entities;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trainerId;
	private String fullName;
	private String emailId;
	private float yearlyTarget;
	private int age;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "TRAINER_ID")
	public Organization organization;
	public Trainer(String fullName2, String emailId2, float target, int age2) {
		this.fullName=fullName2;
		this.emailId=emailId2;
		this.yearlyTarget=target;
		this.age=age2;
	}
	
	
	@OneToOne
	public PersonalProfile personalProfile;
	
	
	public Trainer() {
		super();
	}
	/**
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}
	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	/**
	 * @return the trainerId
	 */
	public long getTrainerId() {
		return trainerId;
	}
	/**
	 * @param trainerId the trainerId to set
	 */
	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the yearlyTarget
	 */
	public float getYearlyTarget() {
		return yearlyTarget;
	}
	/**
	 * @param yearlyTarget the yearlyTarget to set
	 */
	public void setYearlyTarget(float yearlyTarget) {
		this.yearlyTarget = yearlyTarget;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public PersonalProfile getPersonalProfile() {
		return personalProfile;
	}
	public void setPersonalProfile(PersonalProfile personalProfile) {
		this.personalProfile = personalProfile;
	}
	
	
}
