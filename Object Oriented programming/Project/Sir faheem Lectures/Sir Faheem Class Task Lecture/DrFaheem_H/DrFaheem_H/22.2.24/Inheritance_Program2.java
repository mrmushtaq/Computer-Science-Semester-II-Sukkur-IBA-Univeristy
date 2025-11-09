class Student
{

	int nic;
	String name;
	String cellphone;

	String sid;
	String sdept;
	String sbatch;

	Student()
	{
		nic = 123;
		name = "ABC";
		cellphone = "0987-3278237";
	
		sid = "SID-111";
		sdept = "CS";
		sbatch = "Fall-2023";
	}
		void setStudentData(int nic, String name, String cellphone, String sid, String sdept, String sbatch)
	{
		this.nic = nic;
		this.name = name;
		this.cellphone = cellphone;
	
		this.sid = sid;
		this.sdept = sdept;
		this.sbatch = sbatch;
	}

	void displayStudentData()
	{
		System.out.println("  NIC : " + nic);
		System.out.println("  Name : " + name);
		System.out.println("  Cellphone : " + cellphone);
		System.out.println("  SID : " + sid );
		System.out.println("  S Department : " + sdept );
		System.out.println("  S Batch " + sbatch);
	}
	
}


class Teacher
{

	int nic;
	String name;
	String cellphone;

	String tid;
	String tdept;
	String tdesig;

	Teacher()
	{
		nic = 123;
		name = "ABC";
		cellphone = "0987-3278237";
	
		tid = "TID-111";
		tdept = "SE";
		tdesig = "AP";
	}

	void setTeacherData(int nic, String name, String cellphone, String tid, String tdept, String tdesig)
	{
		this.nic = nic;
		this.name = name;
		this.cellphone = cellphone;
	
		this.tid = tid;
		this.tdept = tdept;
		this.tdesig = tdesig;
	}


	void displayTeacherData()
	{
		System.out.println("  NIC : " + nic);
		System.out.println("  Name : " + name);
		System.out.println("  Cellphone : " + cellphone);
		System.out.println("  T ID : " + tid );
		System.out.println("  T Department : " + tdept );
		System.out.println("  T Designation " + tdesig);
	}
	
}

public class Inheritance_Program2
{

	public static void main(String args[])
	{
		Student s = new Student();
		Teacher t = new Teacher();

		
		//s.tid = "dffdfd";

		s.displayStudentData();
		t.displayTeacherData();		



	}







}


