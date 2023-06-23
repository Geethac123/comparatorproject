package CustomSorting;

public class Hotel {
	int id;
	String name ;
	Double rating;
	public Hotel(int id, String name, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	public String toString() {
		return "id:"+id+"name:"+name+" rating"+rating;
	}

}
