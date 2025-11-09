class Employee
{

	int empID;
	String empName;
	private double empSalary;

	void setEmpSalary(double salary)
	{
		empSalary = salary;
	}

	double getEmpSalary()
	{
		return empSalary;
	}

	void setData()
	{
		empID = 1;
		empName = "Kashish";
		empSalary = 0; 
		
	}
	void showData()
	{
		System.out.println("Employee  ID : " + empID);
		System.out.println("Employee  Name : " + empName);
		System.out.println("Employee  Salary : " + empSalary);
	}	

}

public class ProgramEmp4
{

	public static void main(String args[])
	{
		Employee e1;
		e1 = new Employee();
		
		Employee e2 = new Employee();
		

		e1.setData();
		e1.showData();
		e2.showData();
		
		
		





	}

}




