package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Xray {
	@Id
	private String xrayId;
	private int ca;
	private LocalDate date;
	
	
	
	public Xray(String xrayId, int ca, LocalDate date) {
		super();
		this.xrayId = xrayId;
		this.ca = ca;
		this.date = date;
	}

	public String getXrayId() {
		return xrayId;
	}

	public void setXrayId(String xrayId) {
		this.xrayId = xrayId;
	}

	

	//getters and setters
	public int getCa() {
		return ca;
	}

	public void setCa(int ca) {
		this.ca = ca;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	

}
