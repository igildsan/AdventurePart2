public class Range extends Weapon {

    private int bullets = 3;

    public Range(String aItemName, String aDescription, int anAttack, int abullets){
        super(aItemName,aDescription,anAttack);
        this.bullets = abullets;

    }
}
