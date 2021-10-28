
public class Item {
	private String itemName;
	private String description;
	//constructor
	public Item(String aItemName, String aDescription) {
		this.itemName = aItemName;
		this.description = aDescription;
	}
	public Item(String itemName) {
		this.itemName = itemName;
	}

	public String getItemName() {
		return itemName;
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
}
