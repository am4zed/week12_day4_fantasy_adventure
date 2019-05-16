package Game.Players;

import Game.Interfaces.IDefend;
import Game.Interfaces.ITool;
import Game.Tools.Weapon;

public class Knight extends Player{

    public Knight(int defenceLevel, ITool tool){
        super(defenceLevel, tool);
    }

    public void attack(IDefend player) {
        int weaponValue = getToolValue();
        player.defend(weaponValue);
    }

    public void defend(int damage) {

        int armour = getDefenceLevel();

        if ( damage < getHealth() + armour ) {
            health -= ( damage - armour );
        } else {
            youDied();
        }
    }

    private void youDied() {
        health = 0;
    }

}
