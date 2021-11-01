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

		Item ford = new Item("Ford Mustang", "gain 999 street credit");
		Item segway = new Item("segway", "pretty fast, vroom vroom");

		Weapon belt = new Weapon("Belt", "Even your dad would be scared",50);
		Weapon sutsko = new Weapon("sutsko", "impossible to outrun",25);
		Weapon avis = new Weapon("news paper", "look out, really hurts", 12);

		Food bigmac = new Food("bigmac","blesses by ronald mc.donald",50);
		Food redbull = new Food("redbull","give you wings",-60);
		Food spaghetti = new Food("spaghetti","His palms are sweaty, knees weak, arms are heavy\nThere's vomit on his sweater already, mom's spaghetti",45);

		Enemy husForbi = new Enemy("hus forbi homeless guy","Buy a news paper or die",100);

		room1.addEnemy(husForbi);

		room1.addEnemyInventory(avis);

		room1.addItem(ford);
		room1.addItem(segway);
		room2.addItem(belt);
		room4.addItem(sutsko);
		room2.addItem(bigmac);
		room1.addItem(spaghetti);

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
