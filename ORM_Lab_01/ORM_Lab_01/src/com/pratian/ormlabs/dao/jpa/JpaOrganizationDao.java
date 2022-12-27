package com.pratian.ormlabs.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Transaction;

import com.pratian.ormlabs.dao.OrganizationDao;
import com.pratian.ormlabs.dao.util.JpaUtil;
import com.pratian.ormlabs.entities.Organization;
import com.pratian.ormlabs.entities.Trainer;

public class JpaOrganizationDao implements OrganizationDao{

	 

	@Override
	public long saveOrganization(Organization organization) {
		// TODO Auto-generated method stub
		EntityManager em=JpaUtil.getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		em.persist(organization);
		
		et.commit();
		em.clear();
		
		return organization.getOrganizationId();
	}

	@Override
	public boolean updateOrganization(Organization organization) {
		// TODO Auto-generated method stub
		EntityManager em=JpaUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(organization);
		
		em.getTransaction().commit();
		
		em.close();
		
		return true;
	}

	@Override
	public Organization getOrganization(long organizationId) {
		// TODO Auto-generated method stub
		Organization organization=null;
		
		EntityManager em=JpaUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		organization=em.find(Organization.class, organizationId);
		em.getTransaction().commit();
		em.close();
		
		return organization;
	}

	@Override
	public Organization getOrganization(String organizationName) {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEntityManager();
		String jpql="FROM Organization WHERE name=?1";
		em.getTransaction().begin();
		Query query=em.createQuery(jpql,Organization.class);
		query.setParameter(1, organizationName);
		
		List<Organization> organization=query.getResultList();
		
		em.getTransaction().commit();
		
		em.close();
		

		
		return organization.get(0);
	}

	@Override
	public List<Organization> getOrganization() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEntityManager();
		
		String jpql="From Organization";
		
		em.getTransaction().begin();
		Query query=em.createQuery(jpql,Organization.class);
		List<Organization>organizations=query.getResultList();
			
		em.getTransaction().commit();
		em.clear();
		
		return organizations;
	}
	
//	;

}
