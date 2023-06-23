package CustomSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {
	public static void main(String[] args)
	{

		Employee e1=new Employee(101,"tom",50000.00);
		Employee e2=new Employee(102,"jerry",60000.00);
		Employee e3=new Employee(103,"hidi",35000.00);
		Employee e4=new Employee(104,"bhem",65000.00);
		Employee e5=new Employee(105,"indu",55000.00);
		
		Map<Integer,Employee> m=new LinkedHashMap<Integer,Employee>();
		m.put(e1.getId(), e1);
		m.put(e2.getId(), e2);
		m.put(e3.getId(), e3);
		m.put(e4.getId(), e4);
		m.put(e5.getId(), e5);
		
		// Converting Map into set of keys(ID) using keySet()
		Set<Integer>Keys=m.keySet();
		
		// Reference of list & object of ArrayList Storing Employee objects
		
		List<Employee> list=new ArrayList<Employee>();
		
		// Traversing keys using for each loop
		
		for(int key:keys)
		{
			//getting the value(employee object) & adding it into list
			
			list.add(m.get(key));
		}
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1: sort employee by Id");
			System.out.println("2: sort employee by name");
			System.out.println("3: sort employee by salary");
			System.out.println("4: exit \n enter choice:");
			
			int choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1: 
				Collections.sort(list,new sortEmployeeById());
				for(Employee e:list)
				{
					System.out.println(e);
				}
				break;
			case 2:
				Collections.sort(list,new sortEmployeeByName());
				for(Employee e:list)
				{
					System.out.println(e);
				}
				break;
				
			case 3:
				Collections.sort(list,new sortEmployeeBysalary());
				for(Employee e:list)
				{
					System.out.println(e);
				}
				break;
			case 4:
				System.out.println(" thank you");
				System.exit(0);
		    default: 
		    	System.out.println(" invalid choice");
			}
			
			System.out.println("----------------------------------");		}
		
		
		}

}
