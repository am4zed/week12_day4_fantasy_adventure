package Game.Players;

import Game.Interfaces.IDefend;
import Game.Interfaces.ITool;
import Game.Tools.Dragon;

public class Wizard extends Player{

    Dragon dragon;

    public Wizard(int defenceLevel, ITool tool){
        super(defenceLevel, tool);
        this.dragon = new Dragon();
    }

    public void attack(IDefend player) {
        int weaponValue = getToolValue();
        player.defend(weaponValue);
    }

    public void defend(int damage) {

        int armour = getDefenceLevel();
        int shield = dragon.getShield();
        int defense = armour + shield;

        if ( damage < getHealth() + defense ) {
            health -= ( damage - defense );
        } else {
            youDied();
        }
    }

    private void youDied() {
        health = 0;
    }

    public int getToolValue(){
        return this.getTool().getValue();
    }



}
