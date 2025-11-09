class Person
{

	int nic;
	String name;
	private String cellphone;

	Person()
	{
		nic = 123;
		name = "ABC";
		cellphone = "0987-3278237";
	
		
	}
	void setPersonData(int nic, String name, String cellphone)
	{
		this.nic = nic;
		this.name = name;
		this.cellphone = cellphone;
	
		
	}

	void displayPersonData()
	{
		System.out.println("  NIC : " + nic);
		System.out.println("  Name : " + name);
		System.out.println("  Cellphone : " + cellphone);
		
	}

}

class Student extends Person
{

	

	String sid;
	String sdept;
	String sbatch;

	Student()
		{
		sid = "SID-111";
		sdept = "CS";
		sbatch = "Fall-2023";
		}
	void setStudentData( String sid, String sdept, String sbatch)
		{
		
	
		this.sid = sid;	
		this.sdept = sdept;
		this.sbatch = sbatch;
		}

	void displayStudentData()
		{
		System.out.println("  SID : " + sid );
		System.out.println("  S Department : " + sdept );
		System.out.println("  S Batch " + sbatch);
		}
	
}


class Teacher extends Person
{

	String tid;
	String tdept;
	String tdesig;

	Teacher()
	{
		
		tid = "TID-111";
		tdept = "SE";
		tdesig = "AP";
	}

	void setTeacherData(String tid, String tdept, String tdesig)
	{
		
	
		this.tid = tid;
		this.tdept = tdept;
		this.tdesig = tdesig;
	}


	void displayTeacherData()
	{

		System.out.println("  T ID : " + tid );
		System.out.println("  T Department : " + tdept );
		System.out.println("  T Designation " + tdesig);
	}
	
}

public class Inheritance_Program3
{

	public static void main(String args[])
	{
		Student s = new Student();
		Teacher t = new Teacher();
		
		//s.displayPersonData();
		//s.displayStudentData();
		
		s.nic = 7890;
		s.name = "XYZ";
		s.cellphone = "0987-32DFEDFS";  //Error in this line 
	
		s.sid = "SID-F-234";
		s.sdept = "SE";
		s.sbatch = "Fall-2024";

		s.displayPersonData();
		s.displayStudentData();		
			
	}
}