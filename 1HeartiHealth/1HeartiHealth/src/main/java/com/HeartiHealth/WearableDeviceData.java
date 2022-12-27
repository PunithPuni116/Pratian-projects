package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class WearableDeviceData {
	@Id
	private String werableDeviceId;
	private int thalach;
	private int slope;
	private LocalDate date;
	
	
	

	public WearableDeviceData(String werableDeviceId, int thalach, int slope, LocalDate date) {
		super();
		this.werableDeviceId = werableDeviceId;
		this.thalach = thalach;
		this.slope = slope;
		this.date = date;
	}

	public String getWerableDeviceId() {
		return werableDeviceId;
	}

	public void setWerableDeviceId(String werableDeviceId) {
		this.werableDeviceId = werableDeviceId;
	}


	//getters and setters
	public int getThalach() {
		return thalach;
	}

	public void setThalach(int thalach) {
		this.thalach = thalach;
	}

	public int getSlope() {
		return slope;
	}

	public void setSlope(int slope) {
		this.slope = slope;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	

}
