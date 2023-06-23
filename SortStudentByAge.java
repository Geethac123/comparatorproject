package CustomSorting;

import java.util.Comparator;
public class SortStudentByAge implements Comparator<Student> {
	
	@Override
	public int compare(Student x,Student y)
	{
		return x.age-y.age;  // return y.name.compareTo(x.name);
	}
	

}


/** x -> object to be inserted and y-> already existing object
 * 
 * comapare - Interface, java,util package ,jdk 1.2
 *             Syntax: public int compare(Element e1,Element e2);
 *             
 * rules for using Comparator:
 * 1.  Design a new class which implements comparartor interface & import form java.util package.
 * 2.  Specify Generics
 * 3.  Override compare().
 * 4.  create an object of the class which has the sorting logic & pass it to the constructor of TreeSet. 
 * 
 */
