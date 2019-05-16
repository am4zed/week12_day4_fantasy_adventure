package Game.Tools;

public enum PotionType {

    SMALLTONIC(10),
    MEDIUMTONIC(25),
    LARGETONIC(50),
    BUCKY(100);

    private final int damage;

    PotionType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }


}
