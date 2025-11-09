class Student
{

	int sid;
	String sname;
	double sgpa;


	void display()
	{
	System.out.println(" ID : " + sid);
	System.out.println(" Name : " + sname);
	System.out.println(" SGPA : " + sgpa);

	}


}

public class StuProgram
{


	public static void main(String args[])
	{
		
		Student s1, s2;
		s1= new Student();
		s2= new Student();


		s1.sid = 123;
		s1.sname = "ABC";
		s1.sgpa = 3.2;

		System.out.println(" ID : " + s1.sid);
		System.out.println(" Name : " + s1.sname);
		System.out.println(" SGPA : " + s1.sgpa);

		s1.display();

		s2.sid = 345;
		s2.sname = "xyz";
		s2.sgpa = 2.2;
	
		System.out.println(" ID : " + s2.sid);
		System.out.println(" Name : " + s2.sname);
		System.out.println(" SGPA : " + s2.sgpa);
		s2.display();
		

	}






}