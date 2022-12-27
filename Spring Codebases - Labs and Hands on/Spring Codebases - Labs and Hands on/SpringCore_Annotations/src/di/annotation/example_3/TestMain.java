package di.annotation.example_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.annotation.example_2.Employee;

public class TestMain {

	public static void main(String[] args) {
		// Get bean object
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_3.xml");
		
		Employee3 employee = (Employee3) context.getBean("employee");
		//Dislay Employee
	
		
		System.out.println(employee);
	}

}
