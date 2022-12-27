package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Symptom {
	@Id
	private String symptomId;
	private LocalDate date;
	private int exang;
	private int cp;
	private double oldPeak;
	
	

	public Symptom(String symptomId, LocalDate date, int exang, int cp, double oldPeak) {
		super();
		this.symptomId = symptomId;
		this.date = date;
		this.exang = exang;
		this.cp = cp;
		this.oldPeak = oldPeak;
	}

	public String getSymptomId() {
		return symptomId;
	}

	public void setSymptomId(String symptomId) {
		this.symptomId = symptomId;
	}

	

	//getters and setters
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getExang() {
		return exang;
	}

	public void setExang(int exang) {
		this.exang = exang;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public double getOldPeak() {
		return oldPeak;
	}

	public void setOldPeak(double oldPeak) {
		this.oldPeak = oldPeak;
	}

	

	
}
