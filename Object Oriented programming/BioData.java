import java.util.Scanner;
class Student
{
	Scanner sc=new Scanner (System.in);
		int sid;
		String sname;

	 private String FatherName, DOB, Add, Uni, Dep;
	 private char Gender, Sec;
	 private double Gpa;

	 //Constructor
	 Student()
	 {
		sid=-1;
		sname="A";
		FatherName="B";
		DOB="01/01/2000";
		Add="ABC";
		Uni="XYZ";
		Dep="Unknown";
		Gender='M';
		Sec='Z';
		Gpa=0.0;
	 }
// ------------Set Private data from User through SetData and GetData for Student---------------------------
 //------------------SetData------------------
	void SetGender()
	{ 	System.out.print("Enter Gender (M/F) of student : ");
		Gender=sc.next().charAt(0);
	}

	void SetFatherName()
	{	System.out.print("Enter Father's Name of student : ");
		sc.nextLine();
		FatherName=sc.nextLine();
	}

	void SetDOB()
	{	System.out.print("Enter Date of Birth of student : ");
		DOB=sc.nextLine();
	}

	void SetAdd()
	{	System.out.print("Enter Address of student : ");
		Add=sc.nextLine();
	}

	void SetUni()
	{	System.out.print("Enter Name of University of student : ");
		Uni=sc.nextLine();
	}

	void SetDep()
	{	System.out.print("Enter Name of Department of student : ");
		Dep=sc.nextLine();
	}

	void SetSec()
	{	System.out.print("Enter Section (A/B/C ---) of student : ");
		Sec=sc.next().charAt(0);
	}

	void SetGpa()
	{	System.out.print("Enter GPA of student : ");
		Gpa=sc.nextDouble();
	}

//-------------------Getdata----------------
	char GetGender()
	{	return Gender;	}
	double GetGpa()
	{	return Gpa;	}
	char GetSec()
	{	return Sec; }
	String GetDep()
	{	return Dep;	}
	String GetUni()
	{	return Uni; }
	String GetAdd()
	{	return Add;	}
	String GetFatherName()
	{	return FatherName; }
	String GetDOB()
	{	return DOB;	}


//---------------Function OverLoading SetData + "this" keyword-----------
	void SetGender(char Gender)
	{	this.Gender=Gender; }

	void SetFatherName(String FatherName)
	{ this.FatherName=FatherName; }

	void SetDOB(String DOB)
	{ this.DOB=DOB; }

	void SetAdd(String Add)
	{	this.Add=Add; }

	void SetUni(String Uni)
	{	this.Uni=Uni; }

	void SetDep(String Dep)
	{	this.Dep=Dep;	}

	void SetSec(char Sec)
	{	this.Sec=Sec;	}
	void SetGpa(double Gpa)
	{	this.Gpa=Gpa;}


//---------------Function OverLoading GetData-----------
	char GetGender(char Gender)
	{	return Gender;	}
	double GetGpa(double Gpa)
	{	return Gpa;	}
	char GetSec(char sec)
	{	return Sec; }
	String GetDep(String Dep)
	{	return Dep;	}
	String GetUni(String Uni)
	{	return Uni; }
	String GetAdd(String Add)
	{	return Add;	}
	String GetFatherName(String FatherName)
	{	return FatherName; }
	String GetDOB(String DOB)
	{	return DOB;	}


	// ------------Display Public and Private data--------------------------------------------
	void DisplayData()
	{
		System.out.println("\nName of Student : " + sname);
		System.out.println("Gender of Student : " + Gender);
		System.out.println("ID of Student : " + sid);
		System.out.println("Father's name of Student : " + FatherName);
		System.out.println("Date of Birth of Student : " + DOB);
		System.out.println("Address of Student : " + Add);
		System.out.println("Studying in University : " + Uni);
		System.out.println("Department of Student : " + Dep);
		System.out.println("Section of Student : " + Sec);
		System.out.println("GPA of Student : " + Gpa);
	}

}

public class BioData
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		Student s1,s2;
			s1=new Student();
			s2=new Student();

//-----------Assign public values for student 1-----------------------------------
		s1.sid=999;  s1.sname="Mushtaque Ali";
//-----------Assign Private values for student 1-----------------------------------
		s1.GetFatherName("Ghulam Akbar");
		s1.GetGender('M');
		s1.GetGpa(3.43);
		s1.GetSec('H');
		s1.GetUni("SIBAU");
		s1.GetDep("CS");
		s1.GetDOB("11/11/2005");
		s1.GetAdd("Khairpur Mir's");

		s1.SetFatherName("Ghulam Akbar");
		s1.SetGender('M');
		s1.SetGpa(3.43);
		s1.SetSec('H');
		s1.SetUni("SIBAU");
		s1.SetDep("CS");
		s1.SetDOB("11/11/2005");
		s1.SetAdd("Khairpur Mir's");

	// ------------Set data from User for Student ------------------------------------
    //Set (Public) Data from user Directly
		System.out.print("Enter ID number of student : ");
		s2.sid=sc.nextInt();
    	sc.nextLine();
		System.out.print("Enter Name of student : ");
		s2.sname=sc.nextLine();
	
	// Function Call for Private Data 	
		s2.SetGender();   		s2.GetGender();
		s2.SetFatherName();		s2.GetFatherName();
		s2.SetDOB();		s2.GetDOB();
		s2.SetAdd();		s2.GetAdd();
		s2.SetUni();		s2.GetUni();
		s2.SetDep();		s2.GetDep();
		s2.SetSec();		s2.GetSec();
		s2.SetGpa();		s2.GetGpa();

	//Call for Display all record of Student
		System.out.println("\n----------------Assigned Data of Student 1 -------------------");
		s1.DisplayData();
		System.out.println("\n----------------User Input Data of Student 2------------------");
		s2.DisplayData();
	
    }
}