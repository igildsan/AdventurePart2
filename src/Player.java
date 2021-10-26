import java.util.ArrayList;

public class Player {

	private Rooms currentRoom;
	private ArrayList<Item> item = new ArrayList<>(5);
	item.add("sword");
	item.add("staff");

	public Player() {

	}

	public Rooms getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Rooms currentRoom) {
		this.currentRoom = currentRoom;
	}

	public boolean move(String direction) {
		Rooms requestedRoom = null;
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
			return false;
		}
	}
}

