package com.mobilephonesapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilephonesapplication.entities.MobilePhoneList;

@Repository
public interface MobilePhoneListRepository extends JpaRepository<MobilePhoneList,Long>{
	
}
