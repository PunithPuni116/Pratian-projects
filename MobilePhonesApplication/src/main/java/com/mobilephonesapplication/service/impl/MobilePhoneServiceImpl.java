package com.mobilephonesapplication.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilephonesapplication.dto.MobilePhoneDto;
import com.mobilephonesapplication.entities.MobilePhone;
import com.mobilephonesapplication.entities.MobilePhoneList;
import com.mobilephonesapplication.exceptions.MobileListNotFoundException;
import com.mobilephonesapplication.exceptions.MobilePhoneAlreadyExistException;
import com.mobilephonesapplication.exceptions.MobilePhoneListEmptyException;
import com.mobilephonesapplication.exceptions.MobilePhoneNotFoundException;
import com.mobilephonesapplication.mapper.MobilePhoneMapper;
import com.mobilephonesapplication.repository.MobilePhoneListRepository;
import com.mobilephonesapplication.repository.MobilePhoneRepository;
import com.mobilephonesapplication.service.MobilePhoneService;
@Service
public class MobilePhoneServiceImpl implements MobilePhoneService{
	
	@Autowired
	private MobilePhoneRepository mobileRepository;
	
	@Autowired
	private MobilePhoneMapper mobileMapper;
	
	@Autowired
	private MobilePhoneListRepository mobileListRepository;
	
	//to get the list of mobiles phones
	public List<MobilePhone> getAllMobiles() throws MobilePhoneListEmptyException {
		List<MobilePhone> mobileList=mobileRepository.findAll();
		if(mobileList==null)
			throw new MobilePhoneListEmptyException("No mobiles exist in the database");
		return mobileList;
	}

	//to save mobile phone object in DB
	public MobilePhone saveMobilePhone(MobilePhone mobilePhone) throws MobilePhoneAlreadyExistException {
		MobilePhone mobilePhoneFromDb=mobileRepository.getMobilePhoneById(mobilePhone.getMobileId());
		
		if(mobilePhoneFromDb!=null)
			throw new MobilePhoneAlreadyExistException("Mobile phone with id already exist");
	else {
			mobileRepository.save(mobilePhone);
		}
		return mobilePhone;
	}

	//to get mobilephone by id
	public MobilePhone getMobilePhoneById(long id) throws MobilePhoneNotFoundException {
		MobilePhone mobilePhone=mobileRepository.getMobilePhoneById(id);
		if(mobilePhone==null)
			throw new MobilePhoneNotFoundException("Mobile phone with id not found");
		
		return mobilePhone;
	}

	//to get the mobilelist by brand name
	public List<MobilePhone> getMobilePhoneByBrandName(String brandName) throws MobilePhoneListEmptyException {
		// TODO Auto-generated method stub
		List<MobilePhone>mobilePhoneList=mobileRepository.getMobilePhoneByBrandName(brandName);
		
		if(mobilePhoneList.size()==0)
			throw new MobilePhoneListEmptyException("no mobile exist in that brand name");
		
		return mobilePhoneList;
	}
	//to get the mobilelist by model name
	public List<MobilePhone> getMobilePhoneByModelName(String modelName) throws MobilePhoneListEmptyException {
		
		List<MobilePhone>mobilePhoneList=mobileRepository.getMobilePhonesByModelName(modelName);
		
		if(mobilePhoneList.size()==0)
			throw new MobilePhoneListEmptyException("no mobile exist in that model name");
		
		return mobilePhoneList;
		
	}
	//to edit mobile phone
	public MobilePhone editMobilephone(MobilePhone mobilePhone) throws MobilePhoneNotFoundException {
	
		MobilePhone mobileFromDb=mobileRepository.getMobilePhoneById(mobilePhone.getMobileId());
		
		if(mobileFromDb==null)
			throw new MobilePhoneNotFoundException("Mobile phone with given id does not exist");
		mobileFromDb.setBattery(mobilePhone.getBattery());
		mobileFromDb.setColor(mobilePhone.getColor());
		mobileFromDb.setBrandName(mobilePhone.getBrandName());
		mobileFromDb.setProcessor(mobilePhone.getProcessor());
		mobileFromDb.setModelName(mobilePhone.getModelName());
		
		mobileRepository.save(mobileFromDb);
		return mobileFromDb;
	}
	//to delete mobile phone
	public String deleteMobilePhone(long id) throws MobilePhoneNotFoundException {
		MobilePhone mobileFromDb=mobileRepository.getMobilePhoneById(id);
		if(mobileFromDb==null)
			throw new MobilePhoneNotFoundException("Mobile phone with given id does not exist");
		
		mobileRepository.deleteById(id);
		
		return "Deleted Successfully";
	}
	//to get all the mobile phones dto
	public List<MobilePhoneDto> getAllMobilePhonesDto() throws MobilePhoneListEmptyException {
		
		List<MobilePhone>mobileList=mobileRepository.findAll();
		
		List<MobilePhoneDto>mobileDtoList=new ArrayList<MobilePhoneDto>();
		MobilePhoneDto mobileDto=new MobilePhoneDto();
		if(mobileList.size()==0)
			throw new MobilePhoneListEmptyException("No mobile's exist in the record");
		
		//convert each mobile to mobiledto
		for(MobilePhone mobilePhone: mobileList) {
			mobileDto=mobileMapper.convertToDto(mobilePhone);
			mobileDtoList.add(mobileDto);
		}
		return mobileDtoList;
	}
	//get mobiledto by id
	public MobilePhoneDto getMobilePhoneDtoById(long id) throws MobilePhoneNotFoundException {
		// TODO Auto-generated method stub
		MobilePhone mobilePhone=mobileRepository.getMobilePhoneById(id);
		if(mobilePhone==null)
			throw new MobilePhoneNotFoundException("mobile phone does with given id does  not exsit");
		MobilePhoneDto mobileDto=mobileMapper.convertToDto(mobilePhone);
		
		return mobileDto;
	}
	//to get mobiledto list by dto
	public List<MobilePhoneDto> getMobilePhoneDtoByBrandName(String brandName) throws MobilePhoneListEmptyException {
		// TODO Auto-generated method stub
		List<MobilePhone>mobileList=mobileRepository.getMobilePhoneByBrandName(brandName);
		List<MobilePhoneDto>mobileDtoList=new ArrayList<MobilePhoneDto>();
		
		if(mobileList.size()==0)
			throw new MobilePhoneListEmptyException("No mobile's exist in the record with given brand name");
		
		MobilePhoneDto mobileDto=new MobilePhoneDto();
		//convert each mbilephone to mobiledto
		for(MobilePhone mobilePhone: mobileList) {
			mobileDto=mobileMapper.convertToDto(mobilePhone);
			mobileDtoList.add(mobileDto);
		}
		return mobileDtoList;
	}

	public List<MobilePhoneDto> getMobilePhoneDtoByModelName(String modelName) throws MobilePhoneListEmptyException {
		
		List<MobilePhone>mobileList=mobileRepository.getMobilePhonesByModelName(modelName);
		List<MobilePhoneDto>mobileDtoList=new ArrayList<MobilePhoneDto>();
		
		
		if(mobileList.size()==0)
			throw new MobilePhoneListEmptyException("No mobile's exist in the record with given model name");
		//convert each mbilephone to mobiledto
		MobilePhoneDto mobileDto=new MobilePhoneDto();
		for(MobilePhone mobilePhone: mobileList) {
			mobileDto=mobileMapper.convertToDto(mobilePhone);
			mobileDtoList.add(mobileDto);
		}
		return mobileDtoList;
		
		
	}
//number of mobile phones >= cost
	public int getMobilePhone(double cost) {
		// TODO Auto-generated method stub
		int numberOfMobiles=mobileRepository.getMobilePhonesByCost(cost);
		
		return numberOfMobiles;
	}
	
	//mobile phones by list
	public List<MobilePhone> getByProcessor(String processor) throws MobilePhoneListEmptyException {
		// TODO Auto-generated method stub
		List<MobilePhone>mobileList=mobileRepository.getMobilePhoneByProcessor(processor);
		
		if(mobileList.size()==0)
			throw new MobilePhoneListEmptyException("No mobile's exist in the record with given model name");
		return mobileList;
	}
	
	//to get by color
	public List<MobilePhone> getByColor(String color) throws MobilePhoneListEmptyException {
		// TODO Auto-generated method stub
		List<MobilePhone>mobileList=mobileRepository.getMobilePhoneByColor(color);
		
		if(mobileList.size()==0)
			throw new MobilePhoneListEmptyException("No mobile's exist in the record with given color");
		return mobileList;
		
		
	}

	
	//to add mobile phone to mobile list
	public MobilePhoneList addMobilePhoneToList(long mobilePhoneId, long mobilePhoneListId) throws MobilePhoneNotFoundException, MobileListNotFoundException {
		
		MobilePhone mobileFromDb=mobileRepository.getMobilePhoneById(mobilePhoneId);
		
		MobilePhoneList mobilePhoneList=mobileListRepository.findById(mobilePhoneListId).get();
		
		if(mobileFromDb==null)
			throw new MobilePhoneNotFoundException("Mobile phone with given id does not exist");
		if(mobilePhoneList==null)
			throw new MobileListNotFoundException("list given id does not exist");
		//adding mobilephone to list
		mobilePhoneList.getMobilePhoneList().add(mobileFromDb);
		
		mobileListRepository.save(mobilePhoneList);
		
		return mobilePhoneList;
	}


	public int getNumberOfMobilePhones() {
		int numberOfMobiles=mobileRepository.findAll().size();
		
		return numberOfMobiles;
	}
	
	//to create a list for mobilephones
	public MobilePhoneList createMobileList(MobilePhoneList mobilePhoneList) {
		
		mobileListRepository.save(mobilePhoneList);
		
		return mobilePhoneList;
		
	}

}
