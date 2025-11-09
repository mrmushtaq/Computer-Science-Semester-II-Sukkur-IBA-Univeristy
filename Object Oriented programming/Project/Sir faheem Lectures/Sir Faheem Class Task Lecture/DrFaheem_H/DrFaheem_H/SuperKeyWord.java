import java.util.Scanner;

class Person
{

	int nic;
	int a;
	String name;
	
	Person()
	{
		nic = 12345;
		a =10;
		name = "Farhan";
	}

	Person(int nic, String name)
	{
		this.nic = nic;
		this.name = name;
	}
	
	void inputValues()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter NIC : ");
		this.nic = input.nextInt();
		input.nextLine();
		System.out.println("Enter Name : ");
		this.name = input.nextLine();
	}

	void setValues()
	{
		nic = 54321;
		name = "Geeta";
	}


	void display()
	{
	System.out.println(" NIC : " + nic);
	
	System.out.println(" Name : " + name);

	System.out.println(" Person a  : " + a);

	}
	
	void display1()
	{
	
	System.out.println(" Display 1 called : ");

	}


}


class Student  extends Person
{

	int sid;
	int a;
	double sgpa;

	Student()
	{
	sid = 100;
	sgpa = 3.5;
	this.a = 1111;
	super.a = 98765;
	}
	
	Student(int sid, double sgpa)
	{
		this.sid =sid;
		this.sgpa = sgpa;
		
	}
	
	Student(int nic, String name, int sid, double sgpa)
	{
		super(nic,name);
		this.sid =sid;
		this.sgpa = sgpa;
	}
	void inputValues()
	{
		super.inputValues();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter SID : ");
		this.sid = input.nextInt();
		System.out.println("Enter SGPA : ");
		this.sgpa = input.nextDouble();
	}

	void setValues()
	{
		super.setValues();
		this.sid = 101;
		this.sgpa = 3.7;
	}

	
	void display()
	{
	super.display();
	super.display1();
	System.out.println(" ID : " + sid);
	System.out.println(" SGPA : " + sgpa);
	System.out.println(" Child a : " + this.a);
	
	}
}

public class SuperKeyWord
{


	public static void main(String args[])
	{
		//Person p = new Person();
		//p.display();
		
		Student s1 = new Student();
		//Student s2 = new Student(123,"Kashish",987,2);

		//s1.setValues();
		
		//s1.inputValues();

		s1.display();
		//s2.display();

		
		

	}






}