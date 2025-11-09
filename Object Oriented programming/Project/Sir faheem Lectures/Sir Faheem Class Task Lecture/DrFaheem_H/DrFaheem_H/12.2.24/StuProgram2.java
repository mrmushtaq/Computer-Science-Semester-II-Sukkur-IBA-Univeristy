import java.util.Scanner;


class Student
{

	int sid;
	String sname;
	private double sgpa;
	
	
	
	void display()
		{
		System.out.println(" ID : " + sid);
		System.out.println(" Name : " + sname);
		System.out.println(" SGPA : " + sgpa);

		}


}

public class StuProgram2
{


	public static void main(String args[])
	{
		
		Student s1, s2, s3;
		s1= new Student();
		s2= new Student();
		s3= new Student();

		s1.sid = 123;
		s1.sname = "ABC";
		//s1.sgpa = 3.2;

		s1.display();

		
		

	}






}