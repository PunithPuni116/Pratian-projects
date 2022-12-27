package com.pratian.ormlabs.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.pratian.ormlabs.dao.OrganizationDao;
import com.pratian.ormlabs.dao.util.JpaUtil;
import com.sa.entities.Organization;


public class JpaOrganizationDao implements OrganizationDao{

	@Override
	public long saveOrganization(Organization organization) {
		// Get Entity Manager
				EntityManager em = JpaUtil.getEntityManager();
				
				// Begin Transaction
				EntityTransaction et = em.getTransaction();
				et.begin();
				
				// Save / Persist User
				em.persist(organization);//inserting data into table DB
				
				// Commit Transaction
				et.commit();
				
				// Close the Manager
				em.close();
				
				return organization.getId();
	}

	@Override
	public boolean updateOrganization(Organization organization) {
		EntityManager em = JpaUtil.getEntityManager();
		
		// Begin Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		// Save / Persist User
		Organization existingOrganization = em.find(Organization.class, organization.getId()); //id =2
		existingOrganization.setName(organization.getName());
		existingOrganization.setWebsite(organization.getWebsite());
		existingOrganization.setContactNo(organization.getContactNo());
	
		
		// Commit Transaction
		et.commit();
		
		// Close the Manager
		em.close();
		
		return true;
	}

	@Override
	public Organization getOrganization(long organizationId) {
		Organization organization=null;
		
		
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		
		// Get user by user_id
		organization = em.find(Organization.class, organizationId);
		
		// Close the manager
		em.close();
		
		return organization;
	}

	@Override
	public Organization getOrganization(String organizationName) {
		Organization organization=null;
		
		// Get Entity Manager
		EntityManager em = JpaUtil.getEntityManager();
		
		// Write jpql
		String jpql = "from Organization where name =?1";
		
		// Get Query
		Query query = em.createQuery(jpql, Organization.class);
		query.setParameter(1, organizationName);
		// Execute the query and fetch user
				List<Organization> organizations = query.getResultList();
				
				// Close Entity Manager
				em.close();
				
				
		return organizations.get(0);
		
	}

	@Override
	public List<Organization> getOrganizations() {
		
		EntityManager em = JpaUtil.getEntityManager();
		
		// Get Entity Transaction
		EntityTransaction et = em.getTransaction();
		et.begin();
		// Write jpql
		String jpql = "from Organization";
		
		// Get Query
		Query query = em.createQuery(jpql, Organization.class);
		
		// Execute the query and fetch user
		List<Organization> organizations = query.getResultList();
		
		// Close Entity Manager
		et.commit();
		em.close();
		
		return organizations;
	}

	

}
