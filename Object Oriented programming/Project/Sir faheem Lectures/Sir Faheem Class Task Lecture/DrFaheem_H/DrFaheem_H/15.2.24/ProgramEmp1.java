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

public class ProgramEmp1
{

	public static void main(String args[])
	{
		Employee e1;
		e1 = new Employee();
		
		Employee e2 = new Employee();
		
		e1.showData();
		e2.showData();
	}

}