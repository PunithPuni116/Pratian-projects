public class Employee {
	
	// Identity variables of Employee 
	private long empId;
	private String name;
	private int role;
	private float basic;
	private float hra;
	//non-parametrized constructor
	public Employee(){
		
	}
	// Parameterized Constructor
	public Employee(long empId, String name, int role, float basic) {
		this.empId = empId;
		this.name = name;
		this.role = role;
		this.basic = basic;
		this.hra = (0.40f * basic);
	}
	
	// Create getter and setter methods
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = 0.40f*basic;
	}
	public double getAllowance(Employee emp) {
		return SalaryCalculator.getAllowance(emp);
	}
	
	public double getSalary(Employee emp) {
		return SalaryCalculator.getSalary(emp);
	}
	public String getRoleDescription(int role) {
		return RoleBuilder.getRoleDescription(role);
	}
}




















