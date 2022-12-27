package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class BloodTest {
	@Id
	private String blood_id;
	private LocalDate date;
	private int bloodPresure;
	private int fbs;
	private int thal;
	private int serumCholestrol;
	
	

	public BloodTest(String blood_id, LocalDate date, int bloodPresure, int fbs, int thal, int serumCholestrol) {
		super();
		this.blood_id = blood_id;
		this.date = date;
		this.bloodPresure = bloodPresure;
		this.fbs = fbs;
		this.thal = thal;
		this.serumCholestrol = serumCholestrol;
	}

	//getters and setters
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getBloodPresure() {
		return bloodPresure;
	}

	public void setBloodPresure(int bloodPresure) {
		this.bloodPresure = bloodPresure;
	}

	public int getFbs() {
		return fbs;
	}

	public void setFbs(int fbs) {
		this.fbs = fbs;
	}

	public int getThal() {
		return thal;
	}

	public void setThal(int thal) {
		this.thal = thal;
	}

	public int getSerumCholestrol() {
		return serumCholestrol;
	}

	public void setSerumCholestrol(int serumCholestrol) {
		this.serumCholestrol = serumCholestrol;
	}

	public String getBlood_id() {
		return blood_id;
	}

	public void setBlood_id(String blood_id) {
		this.blood_id = blood_id;
	}

	

	

}
