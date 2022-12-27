package com.mobilephonesapplication.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobilephonesapplication.dto.MobilePhoneDto;
import com.mobilephonesapplication.entities.MobilePhone;
import com.mobilephonesapplication.entities.MobilePhoneList;
import com.mobilephonesapplication.exceptions.MobileListNotFoundException;
import com.mobilephonesapplication.exceptions.MobilePhoneAlreadyExistException;
import com.mobilephonesapplication.exceptions.MobilePhoneListEmptyException;
import com.mobilephonesapplication.exceptions.MobilePhoneNotFoundException;
import com.mobilephonesapplication.service.MobilePhoneService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/mobilephone")

public class MobilePhoneController {
	
	@Autowired
	private MobilePhoneService mobileService;
	
	
	@PostMapping("/mobilephone/add")
	@Operation(summary="To add a mobile pohne")
	public ResponseEntity<?>post(@RequestBody MobilePhone mobilePhone){
		
		ResponseEntity<?>response=null;
		try {
			response=new ResponseEntity<MobilePhone>(mobileService.saveMobilePhone(mobilePhone),HttpStatus.CREATED);
			
		} catch (MobilePhoneAlreadyExistException e) {
			response=new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
		}
		
		return response;
	}
	
	@GetMapping("/mobilephone/{id}")
	@Operation(summary = "To get the Product by using id - path variable")
	public ResponseEntity<?> getById(@PathVariable(value = "id") long id){
		ResponseEntity<?> response = null;
		
		try {
			response = new ResponseEntity<MobilePhone>(mobileService.getMobilePhoneById(id), HttpStatus.OK);
		} catch (MobilePhoneNotFoundException e) {
			response=new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
		return response;
	}
	
	@GetMapping("/mobilephone/allmobilephones")
	@Operation(summary = "To get list of mobilephones")
	public ResponseEntity<?> getAllMobiles(){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<List<MobilePhone>>(mobileService.getAllMobiles(), HttpStatus.OK);
		} catch (MobilePhoneListEmptyException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	
	@GetMapping("/mobilephone/mobilephonesbybrandname/{brandName}")
	@Operation(summary = "To get list of mobilephones")
	public ResponseEntity<?> getMobilePhoneByBrandName(@PathVariable(value="brandName")String brandName){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<List<MobilePhone>>(mobileService.getMobilePhoneByBrandName(brandName), HttpStatus.OK);
		} catch (MobilePhoneListEmptyException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	
	@GetMapping("/mobilephone/mobilephonesbymodelname/{modelName}")
	@Operation(summary = "To get list of mobilephones")
	public ResponseEntity<?> getMobilePhoneByModelName(@PathVariable(value="modelName")String modelName){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<List<MobilePhone>>(mobileService.getMobilePhoneByModelName(modelName), HttpStatus.OK);
		} catch (MobilePhoneListEmptyException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@DeleteMapping("/mobilephone/delete/{id}")
	public ResponseEntity<?>deleteMobilePhone(@PathVariable long id){
		ResponseEntity<?>response=null;
		
		try {
			response=new  ResponseEntity<String>(mobileService.deleteMobilePhone(id),HttpStatus.OK);
		}
		catch(MobilePhoneNotFoundException e){
			response=new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		return response;
		
	}
	
	@PutMapping("/mobilephone/edit")
	public ResponseEntity<?> put(@RequestBody MobilePhone mobilePhone){
		ResponseEntity<?>response=null;
		
		try {
			mobileService.editMobilephone(mobilePhone);
			response=new  ResponseEntity<String>("updated successfully",HttpStatus.OK);
			
		}
		catch(MobilePhoneNotFoundException e) {
			response=new  ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@GetMapping("/mobilephone/mobiledtolist")
	@Operation(summary = "To get list of mobilephones")
	public ResponseEntity<?> getAllMobilesPhoneDto(){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<List<MobilePhoneDto>>(mobileService.getAllMobilePhonesDto(), HttpStatus.OK);
		} catch (MobilePhoneListEmptyException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	
	@GetMapping("/mobilephone/mobilephonedtobybrand/{brandName}")
	@Operation(summary = "To get list of mobilephones brand")
	public ResponseEntity<?> getMobilePhoneDtoByBrand(@PathVariable(value="brandName") String brandName){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<List<MobilePhoneDto>>(mobileService.getMobilePhoneDtoByBrandName(brandName), HttpStatus.OK);
		} catch (MobilePhoneListEmptyException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	@GetMapping("/mobilephone/mobilephonedtobymodel/{modelName}")
	@Operation(summary = "To get list of mobilephones by model")
	public ResponseEntity<?> getMobilePhoneDtoByModel(@PathVariable(value="modelName") String modelName){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<List<MobilePhoneDto>>(mobileService.getMobilePhoneDtoByModelName(modelName), HttpStatus.OK);
		} catch (MobilePhoneListEmptyException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@GetMapping("/mobilephone/mobilephonedtobycolor/{color}")
	@Operation(summary = "To get list of mobilephones by color")
	public ResponseEntity<?> getMobilePhoneByColor(@PathVariable(value="color") String color){
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<List<MobilePhone>>(mobileService.getByColor(color), HttpStatus.OK);
		} catch (MobilePhoneListEmptyException e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@GetMapping("/mobilephone/numberofmobilephones")
	public ResponseEntity<?> getNumberOfMobilePhones(){
		
		ResponseEntity<?> response = null;
		
		response = new ResponseEntity<Integer>(mobileService.getNumberOfMobilePhones(), HttpStatus.OK);
		
		return response;
	
	}
	@GetMapping("/mobilephone/numberofmobilephonesbycost/{cost}")
	public ResponseEntity<?> getNumberOfMobilePhonesByCost(@PathVariable(value="cost") double cost){
		
		ResponseEntity<?> response = null;
		
		response = new ResponseEntity<Integer>(mobileService.getMobilePhone(cost), HttpStatus.OK);
		
		return response;
	
	}
	
	@PostMapping("/mobilephonelist/add")
	@Operation(summary="To add a mobile pohne list")
	public ResponseEntity<?>createMobileList(@RequestBody MobilePhoneList mobilePhoneList){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(mobileService.createMobileList(mobilePhoneList),HttpStatus.CREATED);
		
		return response;	
		
	}
	
	@PostMapping("/mobilephone/addmobiletolist/{mobilePhoneId}/{mobileListId}")
	@Operation(summary="To add a mobile pohne list")
	public ResponseEntity<?>addMobileToList(@PathVariable (value="mobilePhoneId")long mobilePhoneId,@PathVariable(value="mobileListId")long mobileListId){
		ResponseEntity<?>response=null;
		
		try {
			response=new ResponseEntity<MobilePhoneList>(mobileService.addMobilePhoneToList(mobilePhoneId, mobileListId),HttpStatus.CREATED);
		} catch (Exception e) {
			
			response=new ResponseEntity<>("Invalid mobile or list id",HttpStatus.NOT_FOUND);
			
		} 
		
		return response;
		
	}
	
	
	
	
}
