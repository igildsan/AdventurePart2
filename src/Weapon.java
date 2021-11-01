public class Weapon extends Item { //melee våben som

    private int attack;

    public Weapon(String aItemName, String aDescription, int anAttack) { //overloading item constructor med attack, en ekstra vaibel
        super(aItemName,aDescription);
        this.attack = anAttack;
    }
}