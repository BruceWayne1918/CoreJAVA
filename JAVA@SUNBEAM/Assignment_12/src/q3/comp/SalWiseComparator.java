package q3.comp;

import java.util.Comparator;

import q3.Employee;

public class SalWiseComparator implements Comparator 
{
	@Override
	public int compare(Object arg0, Object arg1) {
		Employee e1=(Employee)arg1;
		Employee e2=(Employee)arg1;
	
		return - Double.compare(e1.getSal(), e2.getSal());
	}
}