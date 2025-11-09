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
	
	void setData(int id, String name, double salary)
	{
		empID = id;
		empName = name;
		empSalary = salary; 
		
	}
		
	void showData()
	{
		System.out.println("Employee  ID : " + empID);
		System.out.println("Employee  Name : " + empName);
		System.out.println("Employee  Salary : " + empSalary);
	}	

}

public class ProgramEmp5
{

	public static void main(String args[])
	{
		Employee e1;
		e1 = new Employee();
		
		Employee e2 = new Employee();
		
		e1.setData();
		e1.showData();
	
		e2.setData(2,"Siraj",0);
		e2.showData();
	}
}