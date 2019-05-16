import Game.Players.Dwarf;
import Game.Players.Knight;
import Game.Tools.Weapon;
import Game.Tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Dwarf dwarf;
    Weapon sword;
    Weapon axe;

    @Before
    public void before() {
        sword = new Weapon(WeaponType.SWORD);
        axe = new Weapon(WeaponType.AXE);
        knight = new Knight(50, sword);
        dwarf = new Dwarf(20, axe);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void hasDefenceLevel() {
        assertEquals(50, knight.getDefenceLevel());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, knight.getTool());
    }

    @Test
    public void canDefend() {
        knight.defend(70);
        assertEquals(80, knight.getHealth());
    }

    @Test
    public void canDie() {
        knight.defend(160);
        assertEquals( 0, knight.getHealth());
    }

    @Test
    public void canAttack() {
        knight.attack(dwarf);
        assertEquals(90, dwarf.getHealth());
    }
}
