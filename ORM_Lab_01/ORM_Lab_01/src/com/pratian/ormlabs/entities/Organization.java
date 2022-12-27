package com.pratian.ormlabs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long organizationId;
	private String name;
	private String website;
	private long contactNo;
	
	
	public Organization() {
		
	}
	
	public Organization(String name, String website, long contactNo) {
		super();
		
		this.name = name;
		this.website = website;
		this.contactNo = contactNo;
	}
	public long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
}
