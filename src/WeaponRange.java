public class WeaponRange extends Weapon {

    private int bullets = 3;

    public WeaponRange (String aItemName, String aDescription, int anAttack, int abullets){
        super(aItemName,aDescription,anAttack);
        this.bullets = abullets;

    }
}
