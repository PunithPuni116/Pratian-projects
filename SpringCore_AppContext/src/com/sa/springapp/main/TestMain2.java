package com.sa.springapp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sa.springapp.beans.Employee;

public class TestMain2 {

	public static void main(String[] args) {
		// Load the bean context 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
		// Get the bean object 
		Employee emp = (Employee)context.getBean("employee"); 

		// Display bean object state 
		System.out.println("Id : " + emp.getId()); 
		System.out.println("Name : " + emp.getName()); 
		System.out.println("Salary : " + emp.getSalary());

	}

}
