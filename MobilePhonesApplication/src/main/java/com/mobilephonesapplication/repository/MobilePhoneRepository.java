package com.mobilephonesapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.mobilephonesapplication.entities.MobilePhone;

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone,Long>{
	
//	@Query(value="Select m from MobilePhone m")
//	public List<MobilePhone>getAllMobilePhones();
	
	@Query(value="select m from MobilePhone m where m.mobileId=:id")
	public MobilePhone getMobilePhoneById(@Param(value="id")long id);
	
	@Query(value="select m from MobilePhone m where m.brandName=:brandName")
	public List<MobilePhone> getMobilePhoneByBrandName(@Param(value="brandName")String brandName);
	
	@Query(value="Select m from MobilePhone m where m.modelName=:modelName")
	public List<MobilePhone>getMobilePhonesByModelName(@Param(value="modelName")String modelName);
	
	
	@Query(value="select m from MobilePhone m where m.processor=:processor")
	public List<MobilePhone>getMobilePhoneByProcessor(@Param(value="processor")String processor);
	
	@Query(value="select m from MobilePhone m where m.color=:color")
	public List<MobilePhone> getMobilePhoneByColor(@Param(value="color")String color);
	
	@Query(value="select count(m.mobileId) from MobilePhone m where m.mobilePhoneCost>=:cost")
	public int getMobilePhonesByCost(@Param(value="cost")double cost);
	
	
	
}
