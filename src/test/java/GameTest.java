import Game.Game;
import Game.Players.Cleric;
import Game.Players.Knight;
import Game.Rooms.Enemy;
import Game.Rooms.Room;
import Game.Tools.Weapon;
import Game.Tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    Game game;
    Knight knight;
    Enemy caveTroll;
    Weapon sword;
    Room room;

    @Before
    public void before(){

        game = new Game();
        sword = new Weapon(WeaponType.SWORD);
        knight = new Knight(30, sword);
        caveTroll = new Enemy("Cave Troll", 100, 20);
        room = new Room("Main Hall", caveTroll);


    }
}
