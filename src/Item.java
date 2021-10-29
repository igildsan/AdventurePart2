
public class Item {
	private String itemName;
	private String description;

	public Item(String aItemName, String aDescription) { // item constructor
		this.itemName = aItemName;
		this.description = aDescription;

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
