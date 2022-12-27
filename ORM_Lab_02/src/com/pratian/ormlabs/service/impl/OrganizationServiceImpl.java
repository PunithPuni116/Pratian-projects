package com.pratian.ormlabs.service.impl;

import java.util.List;

import com.pratian.ormlabs.Exception.OrganizationNOtFoundException;
import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;

import com.pratian.ormlabs.service.OrganizationService;
import com.sa.entities.Organization;


public class OrganizationServiceImpl implements OrganizationService{
	
	private JpaOrganizationDao organizationDao;
	
	


	public OrganizationServiceImpl(JpaOrganizationDao organizationDao) {
		super();
		this.organizationDao = organizationDao;
	}

	public OrganizationServiceImpl() {
		super();
	}

	@Override
	public boolean addOrganization(Organization organization) throws OrganizationNOtFoundException {
		
		
			organizationDao.saveOrganization(organization);
		
		
		
		return true;
		
	}

	@Override
	public boolean updateOrganization(Organization organization) throws OrganizationNOtFoundException {
		
		return organizationDao.updateOrganization(organization);
			
		
	}

	@Override
	public Organization getOrganizationByid(long id) throws OrganizationNOtFoundException {
		
		Organization organization=null;
		organization=organizationDao.getOrganization(id);
		return organization;
		

	}

	@Override
	public Organization getOrganizationByName(String name) throws OrganizationNOtFoundException {
		
		Organization organization=null;
		organization=organizationDao.getOrganization(name);
		return organization;
	}

	@Override
	public List<Organization> getAllOrganizations() throws OrganizationNOtFoundException {
		List<Organization>organizations=null;
		organizations=organizationDao.getOrganizations();
		return organizations;
	}

	public JpaOrganizationDao getOrganizationDao() {
		return organizationDao;
	}

	public void setOrganizationDao(JpaOrganizationDao organizationDao) {
		this.organizationDao=organizationDao;
	}


	

}
