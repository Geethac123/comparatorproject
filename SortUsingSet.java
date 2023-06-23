package CustomSorting;

import java.util.TreeSet;

public class SortUsingSet {
	public static void main(String[] args)
	{
		Student s1=new Student(20,"tom");
		Student s2=new Student(22,"Jack");
		Student s3=new Student(23,"jarry");
		//SortStudentByAge s=new SortStudentByAge();
		SortStudentByUsingName s=new SortStudentByUsingName();
		TreeSet<Student> t=new TreeSet<Student >(s);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Object std: t) {
			System.out.println(std);
	}

}
}


