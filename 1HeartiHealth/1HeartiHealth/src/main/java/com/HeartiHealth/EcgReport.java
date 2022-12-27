package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class EcgReport {
	@Id
	private String ecgId;
	private int restecg;
	private LocalDate date;
	
	public EcgReport(String ecgId, int restecg, LocalDate date) {
		super();
		this.ecgId = ecgId;
		this.restecg = restecg;
		this.date = date;
	}

	
	
	//getters and setters
	public int getRestecg() {
		return restecg;
	}

	public void setRestecg(int restecg) {
		this.restecg = restecg;
	}

	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	


}
