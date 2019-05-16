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
}
