import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {
        Map map = new Map();
        map.createMap();

        Player player = new Player();
        player.setCurrentRoom(map.getStarterRoom());

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE ADVENTURE GAME!\n");
        System.out.println("THIS IS YOUR COMMANDS:");
        System.out.println("--------------------------------");
        System.out.println("Exit - Exit game\nHelp - Commands list\nLook -Find items & repeat room description \nNorth / Go North / N - Player moves North\nSouth / Go South / S - Player moves South\nEast  / Go East  / E - Player moves East\nWest  / Go West  / W - Player moves West");
        System.out.println("--------------------------------");
        System.out.println("\nYou are in a plane. You are about to jump out of the plane.\n");


        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("south") || (input.equalsIgnoreCase("s"))) {
                player.move("south");
                System.out.println("You are now " + player.getCurrentRoom());

            } else if (input.equalsIgnoreCase("north") || (input.equalsIgnoreCase("n"))) {
                player.move("north");
                System.out.println("You are now " + player.getCurrentRoom());

            } else if (input.equalsIgnoreCase("west") || (input.equalsIgnoreCase("w"))) {
                player.move("west");
                System.out.println("You are now " + player.getCurrentRoom());

            } else if (input.equalsIgnoreCase("east") || (input.equalsIgnoreCase("e"))) {
                player.move("east");
                System.out.println("You are now " + player.getCurrentRoom());

            } else if (input.equalsIgnoreCase("look")) {
                System.out.println("You are " + player.getCurrentRoom());
                player.getCurrentRoom().roomInventoryList();

            } if (player.getCurrentRoom() == map.getWinnerRoom()) {
                System.out.println("You Won!");
                System.exit(1);

            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Winners never quit, and quitters never win");
                System.exit(1);

            } else if (input.equalsIgnoreCase("help")) {
                System.out.println("THIS IS YOUR COMMANDS:\nExit - Lets your exit the game\nLook - Repeats room description \nNorth - Moves north\nSouth - Moves south\nEast - Moves east\nWest - Moves west");

            } else if (input.equalsIgnoreCase("inventory")) {
                System.out.println("Inventory: ");
                for (int i = 0; i < player.getInventory().size(); i++) {
                    System.out.println(player.getInventory().get(i).getItemName());
                }
            } else if (input.equalsIgnoreCase("take")) {
                player.getCurrentRoom().roomInventoryList();
                System.out.println("What item do you want to pick up?");
                Scanner scan = new Scanner(System.in);
                String itemName = scan.nextLine();
                if (player.takeItem(itemName)) {
                    System.out.println("item taken");
                    for (int i = 0; i < player.getInventory().size(); i++) {
                        System.out.println(player.getInventory().get(i).getItemName());
                    }
                }
            }
            else if (input.equalsIgnoreCase("drop")) {
                player.playerinventoryList();
                System.out.println("What item do you want to drop?");
                Scanner scanner = new Scanner(System.in);
                String itemdrop = scanner.nextLine();
                if (player.dropItem(itemdrop)) {
                    System.out.println("item dropped");
                    for (int i = 0; i < player.getInventory().size(); i++) {
                        System.out.println(player.getInventory().get(i).getItemName());
                    }
                }
            }

        }
    }
}


