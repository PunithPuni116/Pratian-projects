package assignment4;

public class Employee implements Comparable<Employee>{
	private int EmployeeId;
	private String EmployeeName;
	private int age;
	private int salary;
	
	public Employee(int employeeId, String employeeName, int age, int salary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		this.age = age;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.EmployeeId==o.getEmployeeId())
			return 0;
		else if(EmployeeId>o.getEmployeeId())
			return 1;
		
		return -1;
	}
	
	

}
