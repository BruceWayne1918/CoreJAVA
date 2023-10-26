import java.io.File;
import java.io.IOException;

//metadata of the file 
// fetch information about the file
public class Day15_3 {

	public static void main(String[] args) throws IOException
	{
		String pathname = "C:/Users/sunbeam/Desktop/Code/DAY15/DAy15_2/src/DAy15_2.java";
		File fobj = new File(pathname);
		System.out.println("Exists = "+fobj.exists());
		System.out.println("Absolute Path =  "+fobj.getAbsolutePath());
		System.out.println("Canonical Path = "+fobj.getCanonicalPath());
		System.out.println("Get Parent = "+fobj.getParent());
		System.out.println("Get Name = "+fobj.getName());
		System.out.println("Can Read ? "+fobj.canRead());
		System.out.println("Length = "+fobj.length());
		System.out.println("is File ?? "+fobj.isFile());
		System.out.println("Is Directory ?"+fobj.isDirectory());
		System.out.println("Is hidden ? "+fobj.isHidden());
		System.out.println("To String = "+fobj.toString());
		

	}

}
