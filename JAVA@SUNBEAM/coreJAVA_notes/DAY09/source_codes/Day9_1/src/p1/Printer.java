package p1;

public interface Printer 
{
	// data member : java compiler implicitly adds  : public static final
	double DATA = 1234.50;
	// public static final double DATA=1234.50;
	
	// method declaration : java compiler implicitly adds : public abstract 
	
	void print(String msg);
	// public abstract void print(String msg);
	
}
