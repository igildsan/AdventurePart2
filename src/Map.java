public class Map {

	private Rooms starterRoom;
	private Rooms winnerRoom;

	public void createMap() {
		Rooms room1 = new Rooms("little cave", "a lot of water");

		Item flashlight = new Item("Flashlight", "A shiny new flashlight");
		//room1.addItem(flashlight);

		Rooms room2 = new Rooms("big dark cave", "dark and smelly");
		Rooms room3 = new Rooms("big ligth cave", "a big cave with a lot of ligth");
		Rooms room4 = new Rooms("little gold cave", "with a staircase");
		Rooms room5 = new Rooms("Golden Room!!!", " a golden room full of treasure and you can see a exit out of the maze");
		Rooms room6 = new Rooms("ligth upper room", " with windows, sunshine and a staircase leading down");
		Rooms room7 = new Rooms("purple cave", "staircase going down to purple cave and it gets dark");
		Rooms room8 = new Rooms("red room", "a big red room with a fire pit");
		Rooms room9 = new Rooms("green room", "green room with a tree");

		room1.setEast(room2);
		room3.setWest(room2);
		room3.setSouth(room6);
		room4.setNorth(room1);
		room5.setSouth(room8);
		room6.setNorth(room3);
		room7.setEast(room8);
		room8.setEast(room9);
		room9.setNorth(room6);
		room4.setSouth(room7);

		starterRoom = room1;
		winnerRoom = room5;
	}

	public Rooms getStarterRoom() {
		return starterRoom;
	}

	public Rooms getWinnerRoom() {
		return winnerRoom;
	}
}
