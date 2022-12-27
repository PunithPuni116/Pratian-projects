package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
	public static void main(String[] args) {
		Employee e1=new Employee(17873,"Ambush",23,150000);
		Employee e2=new Employee(17875,"Ambush",22,150000);
		Employee e3=new Employee(17882,"subhas",21,250000);
		Employee e4=new Employee(17786,"sanket",23,200000);
		Employee e5=new Employee(17007,"chandra",19,2500);
		ArrayList<Employee>list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		//Collections.sort(list);
		//display(list);
		Collections.sort(list,new SortAge());
		display(list);
		//Collections.sort(list,new SortSalary());
		//display(list);
	}
	
	public static void display(ArrayList<Employee>em) {
		for(Employee e:em) {
			System.out.println("Employeee Id :"+e.getEmployeeId());
			System.out.println("Employeee Name :"+e.getEmployeeName());
			System.out.println("Employeee age :"+e.getAge());
			System.out.println("Employeee salary :"+e.getSalary()+"\n");
		}
		System.out.println("-----------");
	}
}
