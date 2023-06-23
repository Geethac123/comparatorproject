package CustomSorting;

import java.util.TreeSet;

public class SortSet {
	public static void main(String[] args)
	{
		Student s1=new Student(20,"tom");
		Student s2=new Student(22,"Jack");
		Student s3=new Student(23,"jarry");
		//SortStudentByAge s=new SortStudentByAge();
		SortHotelById s=new SortHotelById();
		TreeSet<Hotel> ts1=new TreeSet<Hotel >(s);
		SortHotelByName s1=new SortHotelByName();
		TreeSet<Hotel> ts2=new TreeSet<Hotel >(s1);
		SortHotelByRating s=new SortHotelByRating();
		TreeSet<Hotel> ts3=new TreeSet<Hotel >(s);
		
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(Object std: t) {
			System.out.println(std);
	}

}
}

}
