import java.util.ArrayList;
import java.util.Scanner;

public class Player {

	private Room currentRoom;
	private ArrayList<Item> inventory = new ArrayList<>(); //instantiere array
	private ArrayList<Item> equipedInventory = new ArrayList<>();
	private ArrayList<Item> food = new ArrayList<>();
	private Scanner user = new Scanner(System.in);

	private String playerName;
	private String playerDescription;
	private int health = 100;
	private int maxHealth = 100;

	public Player(String aPlayerName, String aPlayerDescription) { // item constructor
		this.playerName = aPlayerName;
		this.playerDescription = aPlayerDescription;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {

		if (health >= 100) {
			this.health = maxHealth;
		} else {
			this.health = health;
		}
		if (this.health <= 100 && this.health > 80) {
			System.out.println("You are in great health");
		} else if (this.health <= 80 && this.health > 50) {
			System.out.println("You are in pretty decent health");
		} else if (this.health <= 50 && this.health > 30) {
			System.out.println("You are in poor health");
		} else if (this.health <= 30 && this.health > 10) {
			System.out.println("You are in critical health");
		} else {
			System.out.println("You are dying");
		}

	}

	public void adjustHealth(int changeHealth) {
		setHealth(getHealth() + changeHealth);
	}

	public void eat() {
		System.out.println("What would you like to eat?");
		String input = user.nextLine();
		for (int i = 0; i < getInventory().size(); i++) {
			if (input.equalsIgnoreCase((getInventory().get(i)).getItemName())) {
				System.out.println("You have eaten " + input);
				Food food = (Food) getInventory().get(i);
				adjustHealth(food.getHealthBack());
				eatItem(input);
			}

		}
	}

	public Player() {
	}
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
	public boolean eatItem(String itemName) { //Kigger i player inventory og fjerner item derfra.
		Item item = findIventoryItem(itemName);
		inventory.remove(item);
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

