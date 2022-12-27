package com.mobilephonesapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class MobilePhoneDto {
	
	
	private long mobilePhoneId;
	private String brandName;
	private String modelName;
	private String color;
	
}
