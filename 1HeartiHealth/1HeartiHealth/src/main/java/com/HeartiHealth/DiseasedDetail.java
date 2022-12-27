package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class DiseasedDetail {
	@Id
	private String diseaseId;
	private LocalDate diagnosedDate;
	private LocalDate recoveredDate;
	private int isRecovered;
	
	

	public DiseasedDetail(String diseaseId, LocalDate diagnosedDate, LocalDate recoveredDate, int isRecovered) {
		super();
		this.diseaseId = diseaseId;
		this.diagnosedDate = diagnosedDate;
		this.recoveredDate = recoveredDate;
		this.isRecovered = isRecovered;
	}

	//getters and setters
	public LocalDate getDiagnosedDate() {
		return diagnosedDate;
	}

	public void setDiagnosedDate(LocalDate diagnosedDate) {
		this.diagnosedDate = diagnosedDate;
	}

	public LocalDate getRecoveredDate() {
		return recoveredDate;
	}

	public void setRecoveredDate(LocalDate recoveredDate) {
		this.recoveredDate = recoveredDate;
	}

	public int getIsRecovered() {
		return isRecovered;
	}

	public void setIsRecovered(int isRecovered) {
		this.isRecovered = isRecovered;
	}

	public String getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(String diseaseId) {
		this.diseaseId = diseaseId;
	}

	

}
