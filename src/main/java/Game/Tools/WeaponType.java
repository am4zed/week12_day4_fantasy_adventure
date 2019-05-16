package Game.Tools;

public enum WeaponType {

    SWORD(30),
    AXE(60),
    SPEAR(40);

    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
