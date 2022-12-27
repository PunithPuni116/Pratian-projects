public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0.0;
		
		// Complete the logic
		salary = emp.getBasic() + emp.getHra() + getAllowance(emp);
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = 0.0;

		// Complete the logic
		int role = emp.getRole();
		allowance = ((role == 1 || role == 2) ? 10 : 
			((role == 3) ? 20 : (role == 4) ? 15 : 0));

		allowance = emp.getBasic() * allowance / 100;
		return allowance;
	}
}
