package com.pratian.ormlabs.service.impl;

import java.util.List;

import com.pratian.ormlabs.dao.jpa.JpaOrganizationDao;
import com.pratian.ormlabs.entities.Organization;
import com.pratian.ormlabs.service.OrganizationService;

public class OrganizationServiceImpl implements OrganizationService{

	private JpaOrganizationDao organizationDao;
	
	public JpaOrganizationDao getOrganizationDao() {
		return organizationDao;
	}
	public void setOrganizationDao(JpaOrganizationDao organizationDao) {
		this.organizationDao = organizationDao;
	}
	public OrganizationServiceImpl() {
		this.organizationDao=new JpaOrganizationDao();
	}
	@Override
	public long addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		Organization organizationFromDao=organizationDao.getOrganization(organization.getOrganizationId());
		if(organizationFromDao==null)
			organizationDao.saveOrganization(organization);
		
		return organization.getOrganizationId();
	}

	@Override
	public boolean updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		
		return organizationDao.updateOrganization(organization);
	}

	@Override
	public Organization getOrganizationById(long organizationId) {
		// TODO Auto-generated method stub
		Organization organization=organizationDao.getOrganization(organizationId);
		try {
			if(organization==null) {
				throw new OrganizationNotFoundException("Organization does not found in records");
			}
		}
		catch(OrganizationNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return organization;
	}

	@Override
	public Organization getOrganizationByName(String organizationName) {
		// TODO Auto-generated method stub
		 
		return organizationDao.getOrganization(organizationName);
	}

	@Override
	public List<Organization> getAllOrganizations() {
		// TODO Auto-generated method stub
		List<Organization>organizations=organizationDao.getOrganization();
		return organizations;
	}

	

}
