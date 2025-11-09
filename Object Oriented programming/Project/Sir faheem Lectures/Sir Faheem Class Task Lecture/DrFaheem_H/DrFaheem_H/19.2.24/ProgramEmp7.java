import java.util.Scanner;

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

	void getData()
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter Employee  ID : ");
		empID = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Employee  Name : " );
		empName = sc.nextLine();

		System.out.print("Enter  Employee  Salary : ");
		empSalary = sc.nextDouble();

	}

	void setData()
	{
		empID = 1;
		empName = "Kashish";
		empSalary = 0; 
		
	}
	
	void setData(int empID, String empName, double empSalary)
	{
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary; 
		
	}
		
	void showData()
	{
		System.out.println("Employee  ID : " + empID);
		System.out.println("Employee  Name : " + empName);
		System.out.println("Employee  Salary : " + empSalary);
	}	

}

public class ProgramEmp7
{

	public static void main(String args[])
	{
		Employee e1;
		e1 = new Employee();
		
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.setData();
		e1.showData();
	
		e2.setData(2,"Siraj",0);
		e2.showData();

		e3.getData();
		e3.showData();


	}

}




