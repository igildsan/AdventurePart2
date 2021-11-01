import java.util.ArrayList;

public class Enemy {

    private String enemyName;
    private String enemyDescription;
    private int enemyHp;


    public Enemy(String anEnemyName, String anEnemyDescription,int anEnemyHp) { // item constructor
        this.enemyName = anEnemyName;
        this.enemyDescription = anEnemyDescription;
        this.enemyHp = anEnemyHp;
    }

    public int getEnemyHp() {
        return enemyHp ;
    }

    public String getEnemyName() {
        return enemyName;
    }

}
