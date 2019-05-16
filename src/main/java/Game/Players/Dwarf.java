package Game.Players;

import Game.Interfaces.IDefend;
import Game.Interfaces.ITool;

public class Dwarf extends Player{

    public Dwarf(int defenceLevel, ITool tool){
        super(defenceLevel, tool);
    }

    public void attack(IDefend player) {
        int weaponValue = getWeaponValue();
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

    public int getWeaponValue(){
        return this.getTool().getValue();
    }



}
