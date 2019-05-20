package Game;

import Game.Players.Player;
import Game.Rooms.Room;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Room> rooms;

    public Game() {
        this.players = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

}
