package com.mobilephonesapplication.service;

import java.util.List;

import com.mobilephonesapplication.dto.MobilePhoneDto;
import com.mobilephonesapplication.entities.MobilePhone;
import com.mobilephonesapplication.entities.MobilePhoneList;
import com.mobilephonesapplication.exceptions.MobileListNotFoundException;
import com.mobilephonesapplication.exceptions.MobilePhoneAlreadyExistException;
import com.mobilephonesapplication.exceptions.MobilePhoneListEmptyException;
import com.mobilephonesapplication.exceptions.MobilePhoneNotFoundException;

public interface MobilePhoneService {
	
	public List<MobilePhone> getAllMobiles() throws MobilePhoneListEmptyException;
    
	public MobilePhone saveMobilePhone(MobilePhone mobilePhone) throws MobilePhoneAlreadyExistException;
	    
	public MobilePhone getMobilePhoneById(long id) throws MobilePhoneNotFoundException;
	 
	public List<MobilePhone> getMobilePhoneByBrandName(String brandName) throws MobilePhoneListEmptyException;    
	 
	public List<MobilePhone> getMobilePhoneByModelName(String modelName) throws MobilePhoneListEmptyException;    
	    
	public MobilePhone editMobilephone(MobilePhone mobilePhone) throws MobilePhoneNotFoundException;
	    
	public String deleteMobilePhone(long id) throws MobilePhoneNotFoundException;
	    
	public List<MobilePhoneDto> getAllMobilePhonesDto() throws MobilePhoneListEmptyException;
	 
	public MobilePhoneDto getMobilePhoneDtoById(long id) throws MobilePhoneNotFoundException;
	 
	public List<MobilePhoneDto> getMobilePhoneDtoByBrandName(String brandName) throws MobilePhoneListEmptyException;    
	 
	public List<MobilePhoneDto> getMobilePhoneDtoByModelName(String modelName) throws MobilePhoneListEmptyException;
	 
	public int getMobilePhone(double cost); //get total number of mobile phones who having cost > 10K
	 
	public List<MobilePhone> getByProcessor(String processor) throws MobilePhoneListEmptyException; //get Mobile Phone whose having processor with name - Quad Core
	 
	public List<MobilePhone> getByColor(String color) throws MobilePhoneListEmptyException; //get Mobile Phone whose having color - black and blue
	 
	public int getNumberOfMobilePhones(); //get total number of mobile phone who are having unique model names
	 
	public MobilePhoneList addMobilePhoneToList(long mobilePhoneId, long MobilePhoneListId) throws MobilePhoneNotFoundException, MobileListNotFoundException; //adding mobilePhone to MobilePhoneList
	
	public MobilePhoneList createMobileList(MobilePhoneList mobilePhoneList);
}
