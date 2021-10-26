import java.util.ArrayList;

public class Player {

	private Rooms currentRoom;
	private ArrayList<Item> item = new ArrayList<>();
	//item.add("sword");
	//item.add("staff");

	public ArrayList<Item> getInventory() {
		return inventory;
	}
	public Player() {
	}
	public boolean takeItem(String itemName){
		Item item = currentRoom.findItem(itemName);
		inventory.add(item);
		currentRoom.getRoomInventory().remove(item);
		return true;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public boolean move(String direction) {
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
		if (requestedRoom != null) {
			currentRoom = requestedRoom;
			return true;

		} else {
			System.out.println("Wrong way");
			return false;
		}
	}
}

