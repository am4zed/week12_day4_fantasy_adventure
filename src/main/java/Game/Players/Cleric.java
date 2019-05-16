package Game.Players;

import Game.Interfaces.IDefend;
import Game.Interfaces.ITool;
import Game.Tools.Dragon;

public class Cleric extends Player{

    public Cleric(int defenceLevel, ITool tool){
        super(defenceLevel, tool);
    }

    public void attack(IDefend player) {
        player.defend(30);
    }

    public void heal(Player player) {
        int healingValue = getToolValue();
        player.setHealth( player.getHealth() + healingValue );
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

    public int getToolValue(){
        return this.getTool().getValue();
    }

}
