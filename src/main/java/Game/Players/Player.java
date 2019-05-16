package Game.Players;

import Game.Interfaces.IAttack;
import Game.Interfaces.IDefend;
import Game.Interfaces.ITool;

public abstract class Player implements IDefend, IAttack {

    protected int health;
    private int defenceLevel;
    private ITool tool;
    private int swagBag;

    public Player(int defenceLevel, ITool tool) {
        this.health = 100;
        this.defenceLevel = defenceLevel;
        this.tool = tool;
        this.swagBag = 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public ITool getTool() {
        return tool;
    }

    public void setTool(ITool tool) {
        this.tool = tool;
    }

    public int getToolValue(){
        return this.getTool().getValue();
    }
}
