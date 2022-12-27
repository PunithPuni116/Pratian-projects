package com.assessment.tio;

import java.util.ArrayList;

public class Module extends  Unit{
	ArrayList<Unit> unit=new ArrayList<>();
	public Module(ArrayList<Unit> unit) {
		this.unit=unit;
	}
	
	public ArrayList<Unit> getModule(){
		return unit;
	}
}
