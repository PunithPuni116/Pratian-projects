package assignment4;

import java.util.Comparator;

public class SortAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		int Name = o1.getEmployeeName().compareTo(
                o2.getEmployeeName());
		
        int Age = o1.getAge().compareTo(o2.getAge());
 
            
            return (Name == 0) ? Age: Name;
	}
	
	
	
	
	

}
