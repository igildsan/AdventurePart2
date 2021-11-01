public class Food extends Item {

    private int healthBack;

    public Food(String aItemName, String aDescription, int healthBack) {
        super(aItemName,aDescription);
        this.healthBack = healthBack;
    }
}