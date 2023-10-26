class Student
{
	private int rollno;
	private String grade;
	
	Student()
	{
		//this.rollno=1;
		//this.grade="NA";
		this(1,"NA"); //constructor chaining 
				
	}
	Student(int rollno, String grade)
	{
		this.rollno=rollno;
		this.grade=grade;
	}
	
	// getters
	int getRollNo()
	{
		return this.rollno;
	}
	
	String getGrade()
	{
		return this.grade;
	}
	
	//setters
	
	void setRollNo(int rollno)
	{
		this.rollno=rollno;
	}
	
	void setGrade(String grade)
	{
		this.grade   = grade;
	}
	
	//facilitator
	void disp()
	{
		System.out.println("Rollno = "+this.rollno+ " Grade = "+this.grade);
	}
}
public class Day4_7 {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student(25,"A");
		s1.disp();
		s2.disp();

	}

}
