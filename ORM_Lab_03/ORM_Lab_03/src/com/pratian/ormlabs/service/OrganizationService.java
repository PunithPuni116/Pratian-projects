package com.pratian.ormlabs.service;

import java.util.List;


import com.sa.entities.Organization;


public interface OrganizationService {
	
	public boolean addOrganization(Organization organization);
	
	public boolean updateOrganization(Organization organization);
	
	public Organization getOrganizationByid(long id);
	
	public Organization getOrganizationByName(String name);
	
	public List<Organization> getAllOrganizations();
	
	
	

}
