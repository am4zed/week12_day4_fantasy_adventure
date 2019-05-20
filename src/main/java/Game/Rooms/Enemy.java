package Game.Rooms;

import Game.Interfaces.IAttack;
import Game.Interfaces.IDefend;

public class Enemy implements IAttack, IDefend {

    private String type;
    private int health;
    private int damage;

    public Enemy(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attack(IDefend player) {
        player.defend(damage);
    }

    @Override
    public void defend(int damage) {
        health -= damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
