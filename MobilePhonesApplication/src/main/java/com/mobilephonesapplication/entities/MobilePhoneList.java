package com.mobilephonesapplication.entities;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.mapping.Array;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
public class MobilePhoneList {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mobilephoneListId_generator")
	@SequenceGenerator(
			name="mobilephoneListId_generator",
			allocationSize=1
			)
	private long listId;
	private String name;
	
	@OneToMany
	private List<MobilePhone>mobilePhoneList = new ArrayList<>();
	
	
}
