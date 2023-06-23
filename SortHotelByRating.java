package CustomSorting;

import java.util.Comparator;

public class SortHotelByRating  implements Comparator<Hotel> {
		
		@Override
		public int compare(Hotel x,Hotel y)
		{
			return x.rating.compareTo(y.rating);  // return y.name.compareTo(x.name);
		}
		

	}

}
