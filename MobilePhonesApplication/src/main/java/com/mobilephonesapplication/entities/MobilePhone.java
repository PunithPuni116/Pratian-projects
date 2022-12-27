package com.mobilephonesapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor //default constructor
@AllArgsConstructor //Parameterized constructor
@Data	//getters and setters
@Entity ////Maps as a table in DB
public class MobilePhone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mobilephoneId_generator")
	@SequenceGenerator(
			name="mobilephoneId_generator",
			allocationSize=1
			)
	
	private long mobileId;
	private String brandName;
	private String modelName;
	private String color;
	private String battery;
	private String processor;
	private double mobilePhoneCost;
	

}
