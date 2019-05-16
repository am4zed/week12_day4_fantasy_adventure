import Game.Interfaces.ITool;
import Game.Players.Dwarf;
import Game.Players.Knight;
import Game.Tools.Weapon;
import Game.Tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    ITool tool;
    Weapon axe;

    @Before
    public void before() {
        axe = new Weapon(WeaponType.AXE);
        dwarf = new Dwarf(20, axe);
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

}
