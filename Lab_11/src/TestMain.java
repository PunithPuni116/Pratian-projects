public class TestMain {
	public static void main(String[] args) {
		
		// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee(1, "E1", Roles.DEVELOPER, 1000.0f);
		Employee emp2 = new Employee(2, "E2", Roles.SR_DEVELOPER, 1000.0f);
		Employee emp3 = new Employee(3, "E3", Roles.SR_DEVELOPER, 1000.0f);
		Employee emp4 = new Employee(4, "E4", Roles.DESIGNER, 1000.0f);
		Employee emp5=new Employee();
		System.out.println("Employee id: ");
		int empid=Console.readInt();
		emp5.setEmpId(empid);
		System.out.println("Employee name: ");
		String name=Console.readLine();
		emp5.setName(name);
		
		emp5.setRole(Roles.DEVELOPER);
		System.out.println("Employee Basic salary: ");
		float basic=Console.readFloat();
		emp5.setBasic(basic);
		
		emp5.setHra(basic);
		Employee employees[] = new Employee[5];

		// Assign objects of Employee to employees declared above
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		employees[3]=emp4;
		employees[4]=emp5;
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
		//	Create an object of EmployeeReport
		EmployeeReport empReport = new EmployeeReport(dtReport);
		//empReport.setDtReport(dtReport);

		// Invoke display() method by passing the employee array
		empReport.display(employees);
	}		
}


















