package CustomSorting;


	import java.util.Comparator;
	public class SortStudentByUsingName implements Comparator<Student> {
		
		@Override
		public int compare(Student x,Student y)
		{
			return x.name.compareTo(y.name);  // return y.name.compareTo(x.name);
		}
		

}
