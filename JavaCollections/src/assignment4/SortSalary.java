package assignment4;

import java.util.Comparator;

public class SortSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int Age = o1.getAge().compareTo(o2.getAge());
		int salary = o1.getSalary().compareTo(o2.getSalary());
		
        
 
            
            return (salary == 0) ? Age: salary;
	}
	
	
	


}
