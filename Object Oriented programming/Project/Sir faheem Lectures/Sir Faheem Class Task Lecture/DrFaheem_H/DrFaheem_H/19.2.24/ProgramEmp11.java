import java.util.Scanner;

class Employee
{

	int empID;
	String empName;
	private double empSalary;
	

	Employee()
	{
		empID = -1;
		empName = "ABC";
		empSalary = -1;  
		
	}
	Employee(int empID, String empName, double empSalary)
	{
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary; 
		
	}
	
	void setEmpSalary(double salary)
	{
		empSalary = salary;
	}

	double getEmpSalary()
	{
		return empSalary;
	}
	double	modifysalary(){
		System.out.println(press 1 for changing salary);
		System.out.println(Press 2 for increasing the salary);
		System.out.println(Press 3 for descreasing the salary);
		int a=next Int
		switch ()
		void incrementSalary()
		{
			empSalary++;
		}
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


public class ProgramEmp11
{

	public static void main(String args[])
	{
		Employee e1, e2;
		e1 = new Employee(2,"Sattar",10);
		e2 = new Employee(3,"Sanam",20);
		
		
	
		e1.incrementSalary();
		e1.showData();
		
		e2.setEmpSalary(e2.getEmpSalary()+1);
		e2.showData();
		
		System.out.println("Do you want to modify dalary of employe . than enter employee no");
		int a=newInt();
		switch (a) {
			case 1:

				
				break;
			case 2:

				break;
			default:
				break;
		}
		
		
		





	}

}




