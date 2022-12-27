import javax.management.relation.Role;

public class EmployeeReport {
	private String dtReport;
	
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		// Complete the logic 
		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\tHRA\tALLOW\tSALARY");
		for(int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i].getEmpId() + "\t" +
					empArr[i].getName() + "\t" + 
					RoleBuilder.getRoleDescription(empArr[i].getRole())
					+ "\t" + empArr[i].getBasic()+ "\t"
					+ empArr[i].getHra() + "\t"
					+ SalaryCalculator.getAllowance(empArr[i]) + "\t"
					+ SalaryCalculator.getSalary(empArr[i]));
			
		}
		
		displayFooter(empArr.length);
		
	}
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}