package com.pratian.ormlabs.service;

import java.util.List;

import com.pratian.ormlabs.entities.Organization;

public interface OrganizationService {

	
	public long addOrganization(Organization organization);
	
	public boolean updateOrganization(Organization organization);
	
	public Organization getOrganizationById(long organizationId);
	
	public Organization getOrganizationByName(String organizationName);
	
	public List<Organization>getAllOrganizations();
}
