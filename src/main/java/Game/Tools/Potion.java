package Game.Tools;

import Game.Interfaces.ITool;

public class Potion implements ITool {

    private PotionType potionType;

    public Potion(PotionType potionType) {
        this.potionType = potionType;
    }

    public int getValue() {
        return potionType.getDamage();
    }
}
