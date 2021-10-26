import java.util.ArrayList;
public class Item {
	private String name;
	private String description;

	public Item(String itemName, String description) {
		this.itemName = itemName;
		this.description = description;
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
