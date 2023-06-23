package CustomSorting;

import java.util.Comparator;

public class SortHotelById  implements Comparator<Hotel> {
		
		@Override
		public int compare(Hotel x,Hotel y)
		{
			return x.id-y.id;  // return y.name.compareTo(x.name);
		}
		

	}

}
