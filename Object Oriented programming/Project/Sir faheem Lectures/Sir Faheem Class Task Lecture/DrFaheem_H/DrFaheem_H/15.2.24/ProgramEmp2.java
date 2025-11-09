class Employee
{

	int empID;
	String empName;
	private double empSalary;

	void showData()
	{
	System.out.println("Employee  ID : " + empID);
	System.out.println("Employee  Name : " + empName);
	System.out.println("Employee  Salary : " + empSalary);
	}	

}

public class ProgramEmp2
{

	public static void main(String args[])
	{
		Employee e1;
		e1 = new Employee();
		
		Employee e2 = new Employee();
		
		e1.empID = 1;
		e1.empName = "Israr";
		e1.empSalary = 0; // Error
		
		System.out.println("Employee  ID : " + e1.empID);
		System.out.println("Employee  Name : " + e1.empName);
		System.out.println("Employee  Salary : " + e1.empSalary); // error
	}
}