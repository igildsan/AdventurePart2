import java.util.Scanner;

public class Adventure {
	private static Object Item;

	public static void main(String[] args) {
		Map map = new Map();
		map.createMap();

		Player player = new Player();
		player.setCurrentRoom(map.getStarterRoom());

		Scanner sc = new Scanner(System.in);
		System.out.println("hej welcome");
		System.out.println("to navigate type: n or north, s or south, e or east, w or west you can also type look to get help");

		while (true) {
			String input = sc.nextLine();
			boolean playerMoved = false;
			if (input.equalsIgnoreCase("south") || (input.equalsIgnoreCase("s"))) {
				playerMoved = player.move("south");
			} else if (input.equalsIgnoreCase("north") || (input.equalsIgnoreCase("n"))) {
				playerMoved = player.move("north");
			} else if (input.equalsIgnoreCase("west") || (input.equalsIgnoreCase("w"))) {
				playerMoved = player.move("west");
			} else if (input.equalsIgnoreCase("east") || (input.equalsIgnoreCase("e"))) {
				playerMoved = player.move("east");
			}

			if (playerMoved) {
				System.out.println("going west");
				System.out.println("you are now in " + player.getCurrentRoom());
				// Udskriv også listen af items i rummet

			} else {
				System.out.println("Wrong way");
			}

			if (player.getCurrentRoom() == map.getWinnerRoom()) {
				System.out.println("you won");
				System.exit(1);
			}
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("winners never quit and quitters never win");
				System.out.println(1);
			}
			if (input.equalsIgnoreCase("look")) {
				System.out.println("sorry i cant help you at this moment... GET IT!!");
			}
			if (input.equalsIgnoreCase("help")) {
				System.out.println("exit,\nNorth\nsouth\neast\nwest\nlook");

				if (input.equalsIgnoreCase("look")) {
					System.out.println("sorry i cant help you at this moment... GET IT!!");
				}
			}
			if (input.equalsIgnoreCase("inventory")) {
				System.out.println();
			}
		}
	}
}


