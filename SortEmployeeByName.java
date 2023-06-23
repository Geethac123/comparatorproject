package CustomSorting;

import java.util.Comparator;

public class SortEmployeeByName implements Comparator<Employee> {
	
public int compare(Employee x,Employee y)
{
	return x.getName().compareTo(y.getName());
}
}
