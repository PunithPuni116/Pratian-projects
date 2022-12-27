package com.pratian.ormlabs.dao;

import java.util.List;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.sa.entities.Organization;


public interface OrganizationDao {

	public long saveOrganization(Organization organization );
	
	public boolean updateOrganization(Organization organization ) throws OrganizationNOtFoundException;
	
	public Organization getOrganization(long organizationId) throws OrganizationNOtFoundException;
	
	public Organization getOrganization(String organizationName) throws OrganizationNOtFoundException;
	
	public List<Organization> getOrganizations() throws OrganizationNOtFoundException;
}
