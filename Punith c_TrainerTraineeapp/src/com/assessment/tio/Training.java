package com.assessment.tio;

import java.util.ArrayList;

public class Training {
	private Trainer trainer;
	 ArrayList<Trainee> trainee=new ArrayList<>();
	 ArrayList<Course> course=new ArrayList<>();
	 ArrayList<Module> module=new ArrayList<>();
	public Training(ArrayList<Course> course,ArrayList<Module> module) {
		this.course=course;
		this.module=module;
	}
	public int getTraineeNum() {
		return trainee.size();
	}
	public String getOrganizationName() {
		return trainer.getOrganization();
	}
	
	public int trainingDurationHour() {
		int hrs=0;
		for(Course course: course) {
			for(Module module: module) {
				for(Unit unit : module.unit)
					hrs+=unit.getDurationHrs();
			}
		}
		return hrs;
	}
}
