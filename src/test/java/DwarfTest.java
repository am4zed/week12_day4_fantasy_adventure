import Game.Interfaces.ITool;
import Game.Players.Dwarf;
import Game.Players.Knight;
import Game.Rooms.Enemy;
import Game.Rooms.Room;
import Game.Rooms.Treasure;
import Game.Rooms.TreasureType;
import Game.Tools.Weapon;
import Game.Tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    ITool tool;
    Weapon axe;
    Room dungeon;
    Enemy orc;
    Room library;
    Treasure diamond;

    @Before
    public void before() {
        axe = new Weapon(WeaponType.AXE);
        dwarf = new Dwarf(20, axe);
        orc = new Enemy("Orc", 80, 10);
        dungeon = new Room("Dungeon", orc);
        diamond = new Treasure(TreasureType.DIAMOND);
        library = new Room("Library", diamond);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void hasDefenceLevel() {
        assertEquals(20, dwarf.getDefenceLevel());
    }

    @Test
    public void hasWeapon() {
        assertEquals(axe, dwarf.getTool());
    }

    @Test
    public void canDefend() {
        dwarf.defend(70);
        assertEquals(50, dwarf.getHealth());
    }

    @Test
    public void canDie() {
        dwarf.defend(160);
        assertEquals( 0, dwarf.getHealth());
    }

    @Test
    public void canEnterRoomAndTakeAction_Enemy() {
        dwarf.enterRoomAndTakeAction(dungeon);
        assertEquals(20, orc.getHealth());
        assertEquals(dungeon, dwarf.getRoom());
    }

    @Test
    public void canEnterRoomAndTakeAction_Treasure() {
        dwarf.enterRoomAndTakeAction(library);
        assertEquals(50, dwarf.getSwagBag());
        assertEquals(null, library.getTreasure());
    }
}
