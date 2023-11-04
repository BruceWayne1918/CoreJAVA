package q3;

import java.util.Objects;

public class Employee 

{
    private int id;
    private double sal;
    private String name;
    
    public Employee()
    {
    	this(1001,"Rajiv",50000);
    }

    @Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		
		return id == other.id;
	}

	public Employee(int id, String name, double sal) {
        this.id = id;
        this.sal = sal;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sal=" + sal +
                ", name='" + name + '\'' +
                '}';
    }
}
