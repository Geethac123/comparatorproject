package CustomSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String[] args)
	{
		ArrayList<Hotel> l=new  ArrayList<Hotel>();
		l.add(new Hotel(101,"tom",10.00));
		l.add(new Hotel(102,"smith",20.00));
		l.add(new Hotel(103,"john",30.00));
		
		System.out.println("-------------");
		
		System.out.println(" SORTING BASED ON ID");
		System.out.println("------------------");
		Collections.sort(l,new SortHotelById());
		for(Hotel s:l)
		{
			System.out.println(s);
		}
		

		System.out.println("-------------");
		System.out.println(" SORTING BASEC ON NAME");
		System.out.println("------------------");
		Collections.sort(l,new SortHotelByName());
		for(Hotel s:l)
		{
			System.out.println(s);
		}
		

		System.out.println("-------------");
		System.out.println(" SORTING BASEC ON NAME");
		System.out.println("------------------");
		Collections.sort(l,new SortHotelByRating());
		for(Hotel s:l)
		{
			System.out.println(s);
		}
		
	}
}

	
		
				
								
				
				
				