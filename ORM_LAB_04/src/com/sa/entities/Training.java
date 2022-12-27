package com.sa.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Training {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trainingId;
	private LocalDate startDate;
	private LocalDate endDate;
	private String clientName;
	
	@OneToOne
	private Trainer trainer;
	
	

	public Training() {
		super();
	}

	public Training(LocalDate startDate, LocalDate endDate, String clientName, Trainer trainer) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.clientName = clientName;
		this.trainer = trainer;
	}

	public long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	
	

}
