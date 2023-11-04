package practice;

public class WildCardGenerics {

	public static void main(String[] args) {
		
		class Box<T>{
			T age;
			
			public <T>void test(T a,T b){
				
				System.out.println(a+" "+b);
				
			}
		}
		
		Box<String>b1=new  Box<>();
		
		b1.test("hello", "bye");
	

	}
	
	class TheBox{
		
		int age;
		
	public void test(<?> a)
	{
		}
	}

}
