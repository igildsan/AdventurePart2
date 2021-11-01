import java.util.ArrayList;

public class Room {
	// variabler med værdierne N,E,W,S
	private Room north;
	private Room south;
	private Room east;
	private Room west;

	private String name;
	private String description;

	private ArrayList<Weapon> enemyInventory = new ArrayList<>(); //instantiere array
	private ArrayList<Item> roomInventory = new ArrayList<>();
	private ArrayList<Enemy> roomEnemyInventory = new ArrayList<>();

	public void addItem (Item item){
		roomInventory.add(item);
	}

	public void addEnemyInventory (Weapon item){
		enemyInventory.add(item);
	}

	public ArrayList<Weapon> getEnemyInventory() {
		return enemyInventory;
	}

	public void addEnemy (Enemy enemy){
		roomEnemyInventory.add(enemy);
	}

	public ArrayList<Item> getRoomInventory() {
		return roomInventory;
	}
	public Item findItem(String itemName) {
		for (int i = 0; i < roomInventory.size(); i++) {
			if (roomInventory.get(i).getItemName().equals(itemName)) {
				return roomInventory.get(i);
			}
		}
		return null;
	}
	public void roomInventoryList(){
		for (int i = 0; i< roomInventory.size(); i++){
			System.out.println(roomInventory.get(i).getItemName());
		}

	}
	public void enemyRoomList(){
		for (int i = 0; i< roomEnemyInventory.size(); i++){
			System.out.println(roomEnemyInventory.get(i).getEnemyName());
		}

	}
	//constructor "Rooms" der kan kaldes fra min main metode
	public Room(String aName, String aDescription) {
		this.name = aName;
		this.description = aDescription;
	}

	public void setDescription(String aDescription) {
		this.description = aDescription;
	}

	public void setName(String aName) {
		this.name = aName;
	}

	public Room getNorth() {
		return north;
	}
	public Room getSouth() {
		return south;
	}
	public Room getEast() {
		return east;
	}
	public Room getWest() {
		return west;
	}

	public void setNorth(Room north) {
		this.north = north;
		this.north.south = (this);
	}

	public void setSouth(Room south) {
		this.south = south;
		this.south.north = (this);
	}

	public void setEast(Room east) {
		this.east = east;
		this.east.west = (this);
	}

	public void setWest(Room west) {
		this.west = west;
		this.west.east = (this);
	}

	public String toString() {
		return name + " " + description;
	}

}
