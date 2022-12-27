package com.HeartiHealth;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class MemberInfo {
	@Id
	private String memberId;
	private String userName;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String email;
	private String phoneNo;
	
	
	public MemberInfo(String memberId, String userName, String firstName, String lastName, int age, String gender,
			String email, String phoneNo) {
		super();
		this.memberId = memberId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	@OneToMany
	@JoinColumn(name="member_info_membere_id")
	private List<AddressInfo>addressList=new ArrayList<AddressInfo>();
	
	@OneToMany
	@JoinColumn(name="member_info_memberId")
	private List<CardioDiagnosis>cardioDiagnosisList=new ArrayList<>();
	
	public List<CardioDiagnosis> getCardioDiagnosisList() {
		return cardioDiagnosisList;
	}
	public void setCardioDiagnosisList(List<CardioDiagnosis> cardioDiagnosisList) {
		this.cardioDiagnosisList = cardioDiagnosisList;
	}
	public List<AddressInfo> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<AddressInfo> addressList) {
		this.addressList = addressList;
	}
	//getters and setters
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
