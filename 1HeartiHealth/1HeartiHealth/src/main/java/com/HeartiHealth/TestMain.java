package com.HeartiHealth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class TestMain {

	public static void main(String[] args) {
		HibernateUtil hb = new HibernateUtil();
		//members info
		MemberInfo memberInfo1 = new MemberInfo("M01","Punith","Punith","c",20,"male","abc@gmail.com","987654332");
		MemberInfo memberInfo2 = new MemberInfo("MO2","Ramesh","Ramesh","Roshan",21,"male","abc@gmail.com","1234567890");
		MemberInfo memberInfo3 = new MemberInfo("MO3","Rakesh","Rakesh","kumar",22,"male","abc@gmail.com","1234567890");
		hb.saveData(memberInfo1);
		hb.saveData(memberInfo2); 
		hb.saveData(memberInfo3);
		

		//address info
		AddressInfo addressInfo1 = new AddressInfo("Ad01","Banglore","karnataka","India","560099");
		AddressInfo addressInfo2 = new AddressInfo("Ad02","chennai","Tamil Nadu","India","563838");
		hb.saveData(addressInfo1);
		hb.saveData(addressInfo2);
		
		//list of address member has
		List<AddressInfo> addressList = new ArrayList<AddressInfo>();
		addressList.add(addressInfo1);
		addressList.add(addressInfo2);
		memberInfo1.setAddressList(addressList);
		
		CardioDiagnosis cardioDiagnosis1=new CardioDiagnosis("cd01",1,LocalDate.now());
		CardioDiagnosis cardioDiagnosis2=new CardioDiagnosis("cd02",0,LocalDate.of(2022, 03, 10));
		CardioDiagnosis cardioDiagnosis3=new CardioDiagnosis("cd03",0,LocalDate.of(2022, 01, 01));
		hb.saveData(cardioDiagnosis1);
		hb.saveData(cardioDiagnosis2);
		hb.saveData(cardioDiagnosis3);
		
		//list of cardiodiagnosis 
		List<CardioDiagnosis>cardioDiagnosisList=new ArrayList<>();
		cardioDiagnosisList.add(cardioDiagnosis1);
		cardioDiagnosisList.add(cardioDiagnosis2);
		memberInfo1.setCardioDiagnosisList(cardioDiagnosisList);
		hb.updateData(memberInfo1);
		
		EcgReport ecgReport1=new EcgReport("ec01",123,LocalDate.of(2022, 11, 01));
		EcgReport ecgReport2=new EcgReport("ec02",200,LocalDate.of(2022, 11, 02));
		EcgReport ecgReport3=new EcgReport("ec03",201,LocalDate.of(2022, 11, 03));
		hb.saveData(ecgReport1);
		hb.saveData(ecgReport2);
		hb.saveData(ecgReport3);
		
		DiseasedDetail diseaseDetail1=new DiseasedDetail("d01",LocalDate.of(2022, 01, 02),LocalDate.of(2022, 03, 01),1);
		DiseasedDetail diseaseDetail2=new DiseasedDetail("d02",LocalDate.of(2022, 01, 02),LocalDate.of(2022, 03, 01),1);
		DiseasedDetail diseaseDetail3=new DiseasedDetail("d03",LocalDate.of(2022, 01, 02),LocalDate.of(2022, 03, 01),1);
		hb.saveData(diseaseDetail1);
		hb.saveData(diseaseDetail2);
		hb.saveData(diseaseDetail3);
		
		Symptom symptom1=new Symptom("s01",LocalDate.of(2022, 04, 11),1,3,2.0);
		Symptom symptom2=new Symptom("s02",LocalDate.of(2022, 05, 12),1,5,1.0);
		Symptom symptom3=new Symptom("s03",LocalDate.of(2022, 06, 13),1,8,2.2);
		hb.saveData(symptom1);
		hb.saveData(symptom2);
		hb.saveData(symptom3);
		
		WearableDeviceData device1=new WearableDeviceData("wd01",1,2,LocalDate.of(2022, 03, 06));
		WearableDeviceData device2=new WearableDeviceData("wd02",3,3,LocalDate.of(2022, 04, 07));
		WearableDeviceData device3=new WearableDeviceData("wd03",4,1,LocalDate.of(2022, 05, 1));
		hb.saveData(device1);
		hb.saveData(device2);
		hb.saveData(device3);
		
		Xray xray1=new Xray("x01",10,LocalDate.of(2022, 10, 01));
		Xray xray2=new Xray("x02",10,LocalDate.of(2022, 11, 02));
		Xray xray3=new Xray("x03",10,LocalDate.of(2022, 11, 03));
		hb.saveData(xray1);
		hb.saveData(xray2);
		hb.saveData(xray3);
		
		BloodTest bloodTest1=new BloodTest("b01",LocalDate.now(),120,10,60,50);
		BloodTest bloodTest2=new BloodTest("b02",LocalDate.now(),130,30,70,90);
		BloodTest bloodTest3=new BloodTest("b03",LocalDate.now(),160,29,80,90);
		hb.saveData(bloodTest1);
		hb.saveData(bloodTest2);
		hb.saveData(bloodTest3);
		
		
		List<EcgReport>ecgreportList=new ArrayList<>();
		ecgreportList.add(ecgReport1);
		ecgreportList.add(ecgReport2);
		ecgreportList.add(ecgReport3);
		
		
		List<DiseasedDetail> diseaseDetaillist=new ArrayList<>();	
		diseaseDetaillist.add(diseaseDetail1);
		diseaseDetaillist.add(diseaseDetail2);
		diseaseDetaillist.add(diseaseDetail3);
		
		List<Symptom> symptomList=new ArrayList<>();
		symptomList.add(symptom1);
		symptomList.add(symptom2);
		symptomList.add(symptom3);
		
		List<WearableDeviceData> deviceList=new ArrayList<>();
		deviceList.add(device1);
		deviceList.add(device2);
		deviceList.add(device3);
		
		
		List<Xray> xrayList=new ArrayList<>();
		xrayList.add(xray1);
		xrayList.add(xray2);
		xrayList.add(xray3);
		
		List<BloodTest>bloodTestList=new ArrayList<>();	
		bloodTestList.add(bloodTest1);
		bloodTestList.add(bloodTest2);
		bloodTestList.add(bloodTest3);
		
		
		cardioDiagnosis1.setEcgReportList(ecgreportList);
		cardioDiagnosis1.setDiseaseDetailList(diseaseDetaillist);
		cardioDiagnosis1.setWearableDeviceData(deviceList);
		cardioDiagnosis1.setSymptomList(symptomList);
		cardioDiagnosis1.setXrayList(xrayList);
		cardioDiagnosis1.setBloodTestList(bloodTestList);
		
		hb.updateData(cardioDiagnosis1);
	}

}
