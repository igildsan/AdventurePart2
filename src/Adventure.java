import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {


		Rooms room1 = new Rooms("little cave", "a lot of water");
		Rooms room2 = new Rooms("big dark cave", "dark and smelly");
		Rooms room3 = new Rooms("big ligth cave", "a big cave with a lot of ligth");
		Rooms room4 = new Rooms("little gold cave", "with a staircase");
		Rooms room5 = new Rooms("dark upper room", " a dark with no windows");
		Rooms room6 = new Rooms("ligth upper room", " with windows, sunshine and a staircase");
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
		Rooms currenRoom = room1;

		Scanner sc = new Scanner(System.in);
		System.out.println("hej welcome");
		System.out.println("to navigate type: north, south, east, west");

		while (true) {
			String input = sc.nextLine();
			Rooms requestedRoom = null;
			if (input.equalsIgnoreCase("south") || (input.equalsIgnoreCase("go south"))) {
					requestedRoom = currenRoom.getSouth();
			} else if (input.equalsIgnoreCase("north") || (input.equalsIgnoreCase("go north"))) {
					requestedRoom = currenRoom.getNorth();
			} else if (input.equalsIgnoreCase("west") || (input.equalsIgnoreCase("go west"))) {
					requestedRoom = currenRoom.getWest();
			} else	if (input.equalsIgnoreCase("east") || (input.equalsIgnoreCase("go east"))) {
				requestedRoom = currenRoom.getEast();
			}

			if (requestedRoom != null) {
				currenRoom = requestedRoom;
			//	System.out.println("going west");
				System.out.println("you are now in " + currenRoom);
			} else {
				System.out.println("Wrong way");
			}

			if (currenRoom == room5) {
				System.out.println("you won");
				System.exit(1);
			}
			if(input.equalsIgnoreCase("exit")){
				System.out.println("winners never quit and quitters never win");
				System.out.println(1);
			}
			if(input.equalsIgnoreCase("look")){
				System.out.println("fat noget");
			}
			if(input.equalsIgnoreCase("help")){
				System.out.println("exit,\nNorth\nsouth\neast\nwest\nlook");
			}
		}
	}
	}








