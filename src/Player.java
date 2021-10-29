import java.util.ArrayList;

public class Player {

	private Room currentRoom;
	private int playerHealth = 100; // instantiere spillers health points
	private ArrayList<Item> inventory = new ArrayList<>(); //instantiere array
	private ArrayList<Item> equipedInventory = new ArrayList<>();
	private ArrayList<Item> food = new ArrayList<>();

	public ArrayList <Item> getEquipedInventory(){
		return equipedInventory;
	}
	public ArrayList<Item> food() {
		return food;
	}
	public ArrayList<Item> getInventory() { //player inventory
		return inventory;
	}
	public Room getCurrentRoom() {
		return currentRoom;
	}
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	public void playerinventoryList(){ //Tjekker player inventory
		for (int i = 0; i< inventory.size(); i++){
			System.out.println(inventory.get(i).getItemName());
		}
	}
	public Player() {
	}
	public boolean takeItem(String itemName){ // Søger efter item i rum, giver det til player og sletter det fra rummet.
		Item item = currentRoom.findItem(itemName);
		inventory.add(item);
		currentRoom.getRoomInventory().remove(item);
		return true;
	}
	public Item findIventoryItem(String itemName) { // looper igennem player inventory, for at tjekke hvad der er i den.
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getItemName().equals(itemName)) {
				return inventory.get(i);
			}
		}
		return null;
	}
	public boolean dropItem(String itemName) { //Kigger i player inventory og fjerner item derfra.
		Item item = findIventoryItem(itemName);
		inventory.remove(item);
		currentRoom.getRoomInventory().add(item);
		return true;
	}
	public boolean equipItem(String Weapon) { //Kigger i player inventory og fjerner item derfra.
		Weapon item = findWeapon(Weapon);
		inventory.remove(item);
		getInventory().add(item);
		return true;
	}
	public Weapon findWeapon(String weaponName) { // looper igennem player inventory, for at tjekke hvad der er i den.
		for (int i = 0; i < inventory.size(); i++) {
			if (inventory.get(i).getItemName().equals(weaponName)) {
				return (Weapon) inventory.get(i);
			}
		}
		return null;
	}
	public boolean eat (String itemName) { //Kigger i player inventory og fjerner item derfra.
		Item item = findIventoryItem(itemName);
		inventory.remove(item);
		return true;
	}

	public boolean move(String direction) { // gør så player kan flytte sig i kompassets retninger
		Room requestedRoom = null;
		if (direction.equalsIgnoreCase("north")) {
			requestedRoom = currentRoom.getNorth();
		} else if (direction.equalsIgnoreCase("south")) {
			requestedRoom = currentRoom.getSouth();
		} else if (direction.equalsIgnoreCase("east")) {
			requestedRoom = currentRoom.getEast();
		} else if (direction.equalsIgnoreCase("west")) {
			requestedRoom = currentRoom.getWest();
		}
		if (requestedRoom != null) { // Udskriver hvad retning player går
			currentRoom = requestedRoom;
			return true;

		} else {
			System.out.println("Wrong way"); //Udskriver hvis player tager en retning der er null
			return false;
		}
	}
}

