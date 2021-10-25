import java.util.ArrayList;
public class Player {

 	private Rooms currentRoom;

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
 		if(direction=="north") {
 			requestedRoom = currentRoom.getNorth();
		} else if( direction == "south") {
 			requestedRoom = currentRoom.getSouth();
		}
		if(requestedRoom != null) {
			currentRoom = requestedRoom;
			return true;
		} else {
			return false;
		}
	}
}

