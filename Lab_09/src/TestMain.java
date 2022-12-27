public class TestMain {
	public static void main(String[] args) {
		
		// Create 4 objects of Employee by passing parameters (Hint: Parameterized Constructor)
		Employee emp1 = new Employee(1, "E1", Roles.DEVELOPER, 1000.0f);
		Employee emp2 = new Employee(2, "E2", Roles.SR_DEVELOPER, 1000.0f);
		Employee emp3 = new Employee(3, "E3", Roles.SR_DEVELOPER, 1000.0f);
		Employee emp4 = new Employee(4, "E4", Roles.DESIGNER, 1000.0f);
		
		Employee employees[] = new Employee[4];

		// Assign objects of Employee to employees declared above
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		employees[3]=emp4;
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
		//	Create an object of EmployeeReport
		EmployeeReport empReport = new EmployeeReport();
		empReport.setDtReport(dtReport);

		// Invoke display() method by passing the employee array
		empReport.display(employees);
	}		
}


















