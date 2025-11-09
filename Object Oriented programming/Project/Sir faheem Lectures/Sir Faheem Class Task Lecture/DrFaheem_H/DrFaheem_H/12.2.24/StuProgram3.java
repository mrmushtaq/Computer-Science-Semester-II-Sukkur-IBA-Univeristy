import java.util.Scanner;


class Student
{

	int sid;
	String sname;
	private double sgpa;
	
	public void setSGPA()
	{
	sgpa = 1;

	}

	public void setSGPA(double d)
	{
	sgpa = d;

	}

	public double getSGPA()
	{
	return sgpa;
	}

	
	void display()
		{
		System.out.println(" ID : " + sid);
		System.out.println(" Name : " + sname);
		System.out.println(" SGPA : " + sgpa);

		}


}

public class StuProgram3
{


	public static void main(String args[])
	{
		
		Student s1, s2, s3;
		s1= new Student();
		s2= new Student();
		s3= new Student();

		s1.sid = 123;
		s1.sname = "ABC";
		s1.setSGPA(); 
		//s1.sgpa = 3.2;

		//s1.display();
		System.out.println(" ID : " + s1.sid);
		System.out.println(" Name : " + s1.sname);
		System.out.println(" SGPA : " + s1.getSGPA());
		
		
		s2.sid = 321;
		s2.sname = "XYZ";
		s2.setSGPA(6); 

		s2.display();
	}






}