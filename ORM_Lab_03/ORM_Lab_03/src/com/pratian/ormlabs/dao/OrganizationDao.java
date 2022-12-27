package com.pratian.ormlabs.dao;

import java.util.List;


import com.sa.entities.Organization;


public interface OrganizationDao {

	public long saveOrganization(Organization organization );
	
	public boolean updateOrganization(Organization organization );
	
	public Organization getOrganization(long organizationId);
	
	public Organization getOrganization(String organizationName);
	
	public List<Organization> getOrganizations();
}
