import java.util.ArrayList;

public class Rooms {
	// variabler med værdierne N,E,W,S
	private Rooms north;
	private Rooms south;
	private Rooms east;
	private Rooms west;

	private String name;
	private String description;
	private ArrayList<>
	//constructor "Rooms" der kan kaldes fra min main metode
	public Rooms(String aName, String aDescription) {
		this.name = aName;
		this.description = aDescription;
	}

	public void setDescription (String aDescription){
	this.description = aDescription;
	}

	public void setName(String aName){
	this.name = aName;
	}

	public Rooms getNorth(){
	return north;
	}
	public Rooms getSouth(){
	return south;
	}
	public Rooms getEast(){
	return east;
	}
	public Rooms getWest(){
	return west;
	}
	public void setNorth(Rooms north){
		this.north = north;
		this.north.south = (this);
	}
	public void setSouth(Rooms south){
		this.south = south;
		this.south.north = (this);
	}
	public void setEast(Rooms east){
		this.east = east;
		this.east.west = (this);
	}
	public void setWest(Rooms west){
		this.west = west;
		this.west.east = (this);
	}

	public String toString(){
		return name + " " + description;
	}

}
