@FunctionalInterface
interface Square
{
	public int getArea(int side); 
}

public class Day18_6 {

	public static void main(String[] args) {
		
		Square sq = (side) -> {return side * side;};
		//sq is reference of FunctionalInterface Type
		
		System.out.println("Area = "+sq.getArea(8));
		
	}

}
