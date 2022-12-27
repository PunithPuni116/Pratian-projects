package com.assessment.tio;

import java.util.ArrayList;

public class Trainee {	
	ArrayList<Training> training=new ArrayList<>();
	public Trainee(ArrayList<Training> training){
		this.training=training;
	}
	public ArrayList<Training> getTrainee(){
		return training;
	}
}
