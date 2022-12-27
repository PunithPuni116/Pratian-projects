package com.assessment.tio;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		
		Unit u1=new Unit();
		Unit u2=new Unit();
		Unit u3=new Unit();
		
		u1.setDurationHrs(1);
		u2.setDurationHrs(2);
		u3.setDurationHrs(3);
		
		ArrayList<Unit> m=new ArrayList<>();
		m.add(u1);
		m.add(u2);
		m.add(u3);
		Module c=new Module(m);
		ArrayList<Module> cr=new ArrayList<>();
		cr.add(c);
		Course course=new Course(cr);
		ArrayList<Course> crs=new ArrayList<>();
		Training t=new Training(crs,cr);
		
		//System.out.println(t.trainingDurationHour());
		ArrayList<Training> tr=new ArrayList<>();
		tr.add(t);
		Trainee tre=new Trainee(tr);
		Organization o=new Organization("bti");
		System.out.println("organiazation name: "+o.getName());
		System.out.println("number of trainee: "+tre.getTrainee().size());
		System.out.println(u3.getDurationHrs());
		
		
		
		
	}
	
	
	
}
