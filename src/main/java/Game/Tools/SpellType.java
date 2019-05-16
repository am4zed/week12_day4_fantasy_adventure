package Game.Tools;

public enum SpellType {

    FIREBALL(30),
    LIGHTNINGSTRIKE(60),
    WINGARDIUMLEVIOSA(40);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
