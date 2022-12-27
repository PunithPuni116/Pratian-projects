package com.pratian.ormlabs.dao;

import java.util.List;

import com.pratian.ormlabs.entities.Organization;

public interface OrganizationDao {
	
	long saveOrganization(Organization organization);
	
	boolean updateOrganization(Organization organization);
	
	Organization getOrganization(long organizationId);
	
	Organization getOrganization(String organizationName);
	
	List<Organization>getOrganization();
}
