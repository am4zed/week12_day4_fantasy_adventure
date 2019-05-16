package Game.Rooms;

public enum TreasureType {

    GOLD(100),
    RUBY(75),
    DIAMOND(50),
    DRAGONGLASS(200),
    MITHRIL(150);

    private final int value;

    TreasureType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
