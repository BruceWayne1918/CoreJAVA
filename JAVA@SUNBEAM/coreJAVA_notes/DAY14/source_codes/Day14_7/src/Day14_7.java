import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	
	
	public int compareTo(Movie m)
	{
		return this.year-m.year;
	}
	
}
public class Day14_7 {

	public static void main(String[] args)
	{
		ArrayList<Movie> al = new ArrayList<Movie>();
		Movie m1 = new Movie(4.5,"abc",2020);
		Movie m2 = new Movie(3.5,"pqr",2019);
		Movie m3 = new Movie(4.8,"def",2022);
		Movie m4 = new Movie(2.4,"xyz",2023);
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		
		System.out.println("List Contents = ");
		for(Movie m : al)
			System.out.println(m);
		
		
		Collections.sort(al);
		System.out.println("After Sorting List = ");
		
		for(Movie m : al)
			System.out.println(m);
	}

}
