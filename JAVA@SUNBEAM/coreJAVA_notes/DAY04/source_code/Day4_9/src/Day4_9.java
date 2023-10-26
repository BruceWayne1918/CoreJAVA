// reference inside the class
//solution to NPE 

//class = fileds + methods (encapsulation)
class Date
{
	private int dd; // data hiding 
	private int mm;
	private int yy;
	
	Date()
	{
		this.dd=1;
		this.mm=1;
		this.yy=1;
	}
	
	Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	void disp()
	{
		System.out.println("DD = "+this.dd+" MM = "+this.mm+" YY = "+this.yy);
	}
	
}
class Employee
{
	int empid; // p type ==> 0
	Date dobj;  // Association 
	// reference inside Employee class // NP type ==> reference ==> null
	
	Employee()
	{
		this.empid=1;
		this.dobj=new Date();
	}
	
	Employee(int empid,Date dobj)
	{
		this.empid=empid;
		this.dobj=new Date(4,8,2023);
	}
	
	void dispRecord()
	{
		System.out.println("Empid =" +this.empid+" DOBJ = "+this.dobj);
	}
	
}
public class Day4_9 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.dispRecord();
		e1.dobj.disp(); 
	
		

	}

}
