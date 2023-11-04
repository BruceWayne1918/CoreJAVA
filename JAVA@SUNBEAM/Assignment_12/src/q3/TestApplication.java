package q3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Book;
import com.sunbeam.Employee;

import q3.comp.IdComparator;
import q3.comp.SalWiseComparator;
import q3.menu.*;

public class TestApplication {
	
	static Comparator c;
	
	static final Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		Employee emp = null;
		List<Employee>empList=new LinkedList<>();
		
		boolean flag=true;
		while(flag)
		{	Employee targetEmp;
			switch(MyMenu.myMenu())
			{
			
			
			
			case EXIT:
				flag=false;
				break;
				
			case ADD:
				System.out.println("Enter Employee ID : ");
				String id= sc.next();
				
				if(!empList.isEmpty()) {
					
					int f=1;


					for(Employee each:empList)
					{
						if(String.valueOf(each.getId()).equals(id))
						{
							System.out.println("Employee of this ID is already present in the List");
							f=0;
							break;

						}
					}

					if(f==1) 
					{
						System.out.println("Enter Employee Name : ");
						String name=sc.next();

						System.out.println("Enter Salary: ");
						double salary=sc.nextDouble();
						empList.add(new Employee( Integer.parseInt(id), name,  salary));
					}


				}

				else{
					System.out.println("Enter Employee Name : ");
					String name=sc.next();

					System.out.println("Enter Salary: ");
					double salary=sc.nextDouble();
					empList.add(new Employee( Integer.parseInt(id), name,  salary));
				}
				break;
				
				
				
		
			case DISPLAY:
				Iterator<Employee>itr= empList.iterator();
				
				int index=0;
				while(itr.hasNext())
				{	index++;
				System.out.println("------------------------------------------------------------------------------------------------------------------");
				System.out.println("Employee : "+index);
				Employee n=itr.next();
				System.out.println(n);
				}
				break;
		
			case SEARCH:
				System.out.println("Enter id to search : ");
				 int empId=sc.nextInt();
				 
				  targetEmp=new Employee(empId,"",0.0);
				 
				 index=empList.indexOf(targetEmp);
				 
				 if (index!= -1)
					{
						
						Iterator<Employee>itr2 = empList.iterator();
						int lstindex=0;
						
						while(itr2.hasNext())
						{	lstindex++;
							if(lstindex==index)
							{
							System.out.println("------------------------------------------------------------------------------------------------------------------");
							System.out.println("EMPLOYEE FOUND AT INDEX : "+lstindex);
							System.out.println("Employee : "+lstindex);
							Employee n=itr2.next();
							System.out.println(n);
							break;
							}
							
							
						}
					} 

					else
					{
						System.out.println("EMPLOYEE NOT FOUND INDEX IS INCORRECT!");
					}
				
				break;
		
			case DELETE:
				
				System.out.println("Enter id to delete : ");
				  empId=sc.nextInt();
				 
				  targetEmp=new Employee(empId,"",0.0);
				 
				 index=empList.indexOf(targetEmp); //calls equals method internally
				 
				 if (index!= -1)
					{
						System.out.println("EMPLOYEE DELETED!");
						Iterator<Employee>itr2 = empList.iterator();
						int lstindex=0;
						while(itr2.hasNext())
							
						{	lstindex++;
							if(lstindex==index)
							{
								empList.remove(lstindex);
								break;
							}
						}
					} 
				 else 
					 {
					 System.out.println("WRONG ID ENTERED ");
					 }
				break;
		
			case SORT_BY_ID:
				c=new IdComparator();
				Collections.sort(empList,c);
				System.out.println("SORTED BY EMP ID ASC !");
				break;
				
			case SORT_BY_SAL:
				c=new SalWiseComparator();
				Collections.sort(empList,c);
				System.out.println("SORTED BY EMP SALARY DESC !");
				break;
		
			
			}
		}

	}

}
