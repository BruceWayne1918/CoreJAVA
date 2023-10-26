class Demo<T,U>
{
	T n1;
	U n2;
	
	Demo(T n1, U n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	void disp()
	{
		System.out.println("N1 = "+this.n1+"  class N1 = "+this.n1.getClass().getName());
		System.out.println("N2 = "+this.n2 +" class N2 = "+this.n2.getClass().getName());
		System.out.println("---------------------------------------------------------");
	}
}

public class Day10_3 {

	public static void main(String[] args) 
	{
		Demo<Integer,Integer> d1 = new Demo<Integer,Integer>(5,4);
		Demo<Float,Double> d2 = new Demo<Float,Double>(4.3f,2.5d);
		Demo<Integer,Double> d3 = new Demo<Integer,Double>(7,5.5);
		Demo<Integer,String> d4 = new Demo<Integer,String>(123,"Sunbeam");
		Demo<String,String> d5 = new Demo<String,String>("Akshita","CoreJava");
		Demo d6 = new Demo(1234,8.8f); // raw type 
		
		d1.disp();
		d2.disp();
		d3.disp();
		d4.disp();
		d5.disp();
		d6.disp();
		

	}

}






