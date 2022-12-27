package com.mobilephonesapplication.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mobilephonesapplication.dto.MobilePhoneDto;
import com.mobilephonesapplication.entities.MobilePhone;



@Mapper
public interface MobilePhoneMapper {
	
	@Mapping(source = "mobilePhone.mobileId", target = "mobilePhoneId")//Source - Entity, target- Dto
	@Mapping(source = "mobilePhone.brandName", target = "brandName")
	@Mapping(source="mobilePhone.modelName", target="modelName")
	@Mapping(source="mobilePhone.color",target="color")
	public MobilePhoneDto convertToDto(MobilePhone mobilePhone); //Convert Entity to Dto
	
	
//	@Mapping(source = "productId", target = "productId")//Source - Dto, target - Entity
//	@Mapping(source = "name", target = "name")
//	public MobilePhone convertToEntity(MobilePhoneDto dto); //Convert Dto to Entity
	
}
