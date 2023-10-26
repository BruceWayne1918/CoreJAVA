package p1;

public class Faculty 
{
	private int fid;
	private String name;

	public Faculty()
	{
		
	}

	public Faculty(int fid, String name) 
	{
		this.fid = fid;
		this.name = name;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo()
	{
		System.out.println("FID = "+this.fid+ " Name = "+this.name);
	}

	@Override
	public String toString() {
		return "Faculty [name=" + this.name + "]";
	}
	
	
	
}
