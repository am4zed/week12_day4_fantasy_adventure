package Game.Rooms;

public class Treasure {

    TreasureType treasureType;

    public Treasure(TreasureType treasureType) {
        this.treasureType = treasureType;
    }

    public int getValue(){
        return treasureType.getValue();
    }

}
