public class Map {

	private Room starterRoom;
	private Room winnerRoom;

	public void createMap() {

		Room room1 = new Room("in a plane.","You are about to jump out of the plane.");
		Room room2 = new Room("falling.","You are currently falling with 200 mph, your childhood memories are replaying before your eyes. ");
		Room room3 = new Room("dead.","You smashed a massive hole in the ground, you are dead.");
		Room room4 = new Room("falling.","You are falling with 200mph, you are about to pull your parachute. ");
		Room room5 = new Room("in a 7-eleven.","You bought a 6-pack of beers and a pack of cigarettes. Today has been a good day.");
		Room room6 = new Room("hit by a magical light.","....You have resin from the dead.");
		Room room7 = new Room("at Strøget.","You are flying safely above Copenhagen, and landing at the nice landing strip Strøget. ");
		Room room8 = new Room("walking down the street.","People are yelling at you, but you dont care." );
		Room room9 = new Room("at Storke springvandet.","Your washing the blood of your clothes, unfortunately you hit a family on the way down. ");

		Item lamp = new Item("lamp", "magical and bright");
		Item sword = new Item("sword", "really big sharp knife");
		Item spear = new Item("spear", "spear, very pointy");
		Item bigmac = new Item("bigmac","blesses by ronald mc.donald",50);

		room1.addItem(lamp);
		room2.addItem(sword);
		room4.addItem(spear);
		room2.addItem(bigmac);

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

	public Room getStarterRoom() {
		return starterRoom;
	}

	public Room getWinnerRoom() {
		return winnerRoom;
	}
}
