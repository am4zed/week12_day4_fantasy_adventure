package Game.Rooms;

public class Room {

    private String type;
    public Treasure treasure;
    public Enemy enemy;

    public Room(String type, Treasure treasure) {
        this.type = type;
        this.treasure = treasure;
    }

    public Room(String type, Enemy enemy) {
        this.type = type;
        this.enemy = enemy;
    }

    public String getType() {
        return type;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
