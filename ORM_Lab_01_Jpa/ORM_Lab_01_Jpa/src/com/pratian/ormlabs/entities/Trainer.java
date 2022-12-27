package com.pratian.ormlabs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trainerId;
	
	
	private String fullName;
	private String emailId;
	private float yearlyTarget;
	private int age;
	
	public Trainer() {
		super();
	}
	
	public Trainer(String fullName, String emailId, float yearlyTarget, int age) {
		super();
		this.fullName = fullName;
		this.emailId = emailId;
		this.yearlyTarget = yearlyTarget;
		this.age = age;
	}
	
	public long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(long trainerId) {
		this.trainerId = trainerId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public float getYearlyTarget() {
		return yearlyTarget;
	}
	public void setYearlyTarget(float yearlyTarget) {
		this.yearlyTarget = yearlyTarget;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", fullName=" + fullName + ","
				+ " emailId=" + emailId + " yearlyTarget=" + yearlyTarget+ " age=" + age + "]";
		
		
	}
}
