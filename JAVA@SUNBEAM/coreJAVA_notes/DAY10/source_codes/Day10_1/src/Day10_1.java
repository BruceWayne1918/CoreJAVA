

//this program is without generic.
// the number  of times data type is changing 
// those many number of matching methods / constructors we need to develop


class Test
{
	int num;
	double dval;
	Test(int num)
	{
		this.num=num;
	}
	Test(double dval)
	{
		this.dval = dval;
	}
	
	int getData()
	{
		return this.num;
	}
}
public class Day10_1 {

	public static void main(String[] args)
	{
		Test tobj = new Test(10);
		Test t2= new Test(5.5);
		System.out.println(tobj.getData());
		
		
		
	}

}
