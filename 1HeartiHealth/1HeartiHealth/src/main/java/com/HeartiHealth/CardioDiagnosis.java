package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CardioDiagnosis {
	@Id
	private String cardioId;
	private int cardioArrestDetected;
	private LocalDate date;
	
	@OneToMany
	@JoinColumn(name="cardio_diagnosis_id")
	private List<DiseasedDetail>diseaseDetailList=new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="cardio_diagnosis_id")
	private List<EcgReport>ecgReportList=new ArrayList<>();
	
	
	@OneToMany
	@JoinColumn(name="cardio_diagnosis_id")
	private List <Symptom>symptomList=new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="cardio_diagnosis_id")
	private List <WearableDeviceData>wearableDeviceData=new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="cardio_diagnosis_id")
	private List <BloodTest>bloodTestList=new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="cardio_diagnosis_id")
	private List <Xray>xrayList=new ArrayList<>();
	
	
	
	
	public CardioDiagnosis(String cardioId, int cardioArrestDetected, LocalDate date) {
		super();
		this.cardioId = cardioId;
		this.cardioArrestDetected = cardioArrestDetected;
		this.date = date;
	}

	public String getCardioId() {
		return cardioId;
	}

	public List<DiseasedDetail> getDiseaseDetailList() {
		return diseaseDetailList;
	}

	public void setDiseaseDetailList(List<DiseasedDetail> diseaseDetailList) {
		this.diseaseDetailList = diseaseDetailList;
	}

	public List<EcgReport> getEcgReportList() {
		return ecgReportList;
	}

	public void setEcgReportList(List<EcgReport> ecgReportList) {
		this.ecgReportList = ecgReportList;
	}

	public List<Symptom> getSymptomList() {
		return symptomList;
	}

	public void setSymptomList(List<Symptom> symptomList) {
		this.symptomList = symptomList;
	}

	public List<WearableDeviceData> getWearableDeviceData() {
		return wearableDeviceData;
	}

	public void setWearableDeviceData(List<WearableDeviceData> wearableDeviceData) {
		this.wearableDeviceData = wearableDeviceData;
	}

	public List<BloodTest> getBloodTestList() {
		return bloodTestList;
	}

	public void setBloodTestList(List<BloodTest> bloodTestList) {
		this.bloodTestList = bloodTestList;
	}

	public List<Xray> getXrayList() {
		return xrayList;
	}

	public void setXrayList(List<Xray> xrayList) {
		this.xrayList = xrayList;
	}

	public void setCardioId(String cardioId) {
		this.cardioId = cardioId;
	}

	

	//getters and setters
	public int getCardioArrestDetected() {
		return cardioArrestDetected;
	}

	public void setCardioArrestDetected(int cardioArrestDetected) {
		this.cardioArrestDetected = cardioArrestDetected;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	

	
}
