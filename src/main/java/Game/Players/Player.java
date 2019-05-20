package Game.Players;

import Game.Interfaces.IAttack;
import Game.Interfaces.IDefend;
import Game.Interfaces.ITool;
import Game.Rooms.Room;
import Game.Rooms.Treasure;

public abstract class Player implements IDefend, IAttack {

    protected int health;
    private int defenceLevel;
    private ITool tool;
    private int swagBag;
    private Room room;

    public Player(int defenceLevel, ITool tool) {
        this.health = 100;
        this.defenceLevel = defenceLevel;
        this.tool = tool;
        this.swagBag = 0;
        this.room = null;
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

    public int getToolValue() {
        return this.getTool().getValue();
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public int getSwagBag() {
        return swagBag;
    }

    public void setSwagBag(int swagBag) {
        this.swagBag = swagBag;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void enterRoomAndTakeAction(Room room) {
        this.setRoom(room);
        if (room.getEnemy() != null) {
            this.attack(room.getEnemy());
        } else if (room.getTreasure() != null) {
            this.takeTreasure(room.getTreasure());
            room.treasure = null;
        }
    }

    public void takeTreasure(Treasure treasure){
        this.swagBag += treasure.getValue();
    }

}

