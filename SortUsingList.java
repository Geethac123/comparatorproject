package CustomSorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingList {
	public static void main(String[] args)
	{
		ArrayList<Student> l=new  ArrayList<Student>();
		l.add(new Student(22,"tom"));
		l.add(new Student(23,"smith"));
		l.add(new Student(21,"john"));
		
		System.out.println("-------------");
		
		System.out.println(" SORTING BASED ON AGE");
		System.out.println("------------------");
		Collections.sort(l,new SortStudentByAge());
		for(Student s:l)
		{
			System.out.println(s);
		}
		

		System.out.println("-------------");
		System.out.println(" SORTING BASEC ON NAME");
		System.out.println("------------------");
		Collections.sort(l,new SortStudentByUsingName());
		for(Student s:l)
		{
			System.out.println(s);
		}
		
		
			}

}
