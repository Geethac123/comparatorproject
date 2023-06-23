package CustomSorting;

import java.util.Comparator;

public class SortHotelByName  implements Comparator<Hotel> {
		
		@Override
		public int compare(Hotel x,Hotel y)
		{
			return x.name.compareTo(y.name);  // return y.name.compareTo(x.name);
		}
		

	}

}
