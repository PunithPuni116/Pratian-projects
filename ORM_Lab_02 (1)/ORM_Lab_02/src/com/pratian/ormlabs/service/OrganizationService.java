package com.pratian.ormlabs.service;

import java.util.List;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.sa.entities.Organization;


public interface OrganizationService {
	
	public boolean addOrganization(Organization organization) throws OrganizationNOtFoundException ;
	
	public boolean updateOrganization(Organization organization) throws OrganizationNOtFoundException;
	
	public Organization getOrganizationByid(long id) throws OrganizationNOtFoundException;
	
	public Organization getOrganizationByName(String name) throws OrganizationNOtFoundException;
	
	public List<Organization> getAllOrganizations() throws OrganizationNOtFoundException;
	
	
	

}
