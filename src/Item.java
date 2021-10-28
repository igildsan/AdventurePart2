
public class Item {
	private String itemName;
	private String description;
	private int health;

	public Item(String aItemName, String aDescription) { // item constructor
		this.itemName = aItemName;
		this.description = aDescription;
	}
	public Item(String aItemName, String aDescription,int aHealth) { //overloading item constructor med health, en ekstra vaibel
		this.itemName = aItemName;
		this.description = aDescription;
		this.health = aHealth;
	}
	public String getItemName() {
		return itemName;
	}
	public int getHealth() {
		return health;
	}
	public String getDescription() {

		return description;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public void setHealth(int health) {
		this.health = health;
	}
}
