package com.caseStudy.bank;

public class Current extends Account{
	private String companyName;
	private long registrationNo;
	private String website;
	public Current() {
		
	}
	public Current(String name,String companyName, long registrationNo,String website) {
		this.companyName=companyName;
		this.registrationNo=registrationNo;
		this.website=website;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(long registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
}
