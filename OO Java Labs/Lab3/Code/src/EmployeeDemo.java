public class EmployeeDemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		
		storeData(emp);
		
		showData(emp);
	}

	public static void storeData(Employee emp)  {
		System.out.println("Enter EmpId : ");
		String empId = Console.readLine();
		emp.empId=empId;
		
		System.out.println("Enter Name : ");
		String name = Console.readLine();
		emp.name=name;
		
		System.out.println("Address Line1 : ");
		String addrLine1 = Console.readLine();
		emp.address1=addrLine1;
		
		System.out.println("Address Line2 : ");
		String addrLine2 = Console.readLine();
		emp.address2=addrLine2;
		
		System.out.println("Address City : ");
		String city = Console.readLine();
		emp.addressCity=city;
		
		System.out.println("Address Pin : ");
		String pin = Console.readLine();
		emp.addressPin=pin;
		
		


	}
	public static void showData(Employee emp) {
		
		System.out.println("Emp Id : "+ emp.empId);
		System.out.println("Name : "+ emp.name);
		System.out.println("--------------------------------------------");
		System.out.println("Addr Line1 : "+ emp.address1);
		System.out.println("Addr Line2 : "+emp.address2);
		System.out.println("City : "+emp.addressCity);
		System.out.println("Pin : "+emp.addressPin);
		System.out.println("--------------------------------------------");

		


	}
}














