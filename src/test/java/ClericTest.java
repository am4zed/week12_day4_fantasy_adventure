import Game.Players.Cleric;
import Game.Players.Dwarf;
import Game.Players.Knight;
import Game.Tools.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Dwarf dwarf;
    Potion potion;
    Potion potion2;
    Weapon axe;

    @Before
    public void before() {
        potion = new Potion(PotionType.SMALLTONIC);
        potion2 = new Potion(PotionType.BUCKY);
        axe = new Weapon(WeaponType.AXE);
        cleric = new Cleric(50, potion);
        dwarf = new Dwarf(20, axe);
    }

    @Test
    public void hasHealth() {
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void hasDefenceLevel() {
        assertEquals(50, cleric.getDefenceLevel());
    }

    @Test
    public void hasPotion() {
        assertEquals(potion, cleric.getTool());
    }

    @Test
    public void canDefend() {
        cleric.defend(70);
        assertEquals(80, cleric.getHealth());
    }

    @Test
    public void canDie() {
        cleric.defend(160);
        assertEquals( 0, cleric.getHealth());
    }

    @Test
    public void canAttack() {
        cleric.attack(dwarf);
        assertEquals(90, dwarf.getHealth());
    }

    @Test
    public void canHeal(){
        cleric.attack(dwarf);
        assertEquals(90, dwarf.getHealth());
        cleric.heal(dwarf);
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canChangePotion() {
        cleric.setTool(potion2);
        assertEquals(potion2, cleric.getTool());
    }

    @Test
    public void canEnterRoom() {

    }
}
