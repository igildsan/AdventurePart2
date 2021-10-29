public class Food extends Item {

    private int health;

    public Food(String aItemName, String aDescription, int aHealth) {//overloading item constructor med health, en ekstra vaibel
        super(aItemName,aDescription);
        this.health = aHealth;
    }
}