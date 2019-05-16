package Game.Tools;

import Game.Interfaces.ITool;

public class Spell implements ITool {

    private SpellType spellType;

    public Spell(SpellType spellType) {
        this.spellType = spellType;
    }

    public int getValue() {
        return spellType.getDamage();
    }
}
